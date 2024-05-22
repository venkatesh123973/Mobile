package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;

public class base {
    public AndroidDriver driver;
//    public static void main(String[] args) throws MalformedURLException {
//        beforesetup set= new beforesetup();
//        set.setup();
//    }
    @BeforeSuite
    public void setup() throws MalformedURLException {
//        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\venka\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).withArgument(() -> "--base-path", "/").withTimeout(Duration.ofSeconds(300)).build();
////
//        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        UiAutomator2Options op = new UiAutomator2Options();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","Uiautomator2");
        capabilities.setCapability("platformVersion","14.0");
        capabilities.setCapability("enforceXPath1", true);
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","C:\\Users\\venka\\Downloads\\General-Store.apk");
        capabilities.setCapability("deviceName","Emulator");
        capabilities.setCapability("chromedriverExecutable", "C:\\Users\\venka\\Downloads\\chromedriver.exe");
        URL url = new URL("http://127.0.0.1:4723/");
         driver = new AndroidDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

    }

    public void scrollelement(String ele){
         driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ele+"\"));")).click();

    }

    public void startrecording(){
        ((CanRecordScreen)driver).startRecordingScreen();
    }

    public void stoprecording(){
        String video= ((CanRecordScreen)driver).stopRecordingScreen();
        byte[] dec = Base64.getMimeDecoder().decode(video);
        try {

            Path paths = Paths.get(System.getProperty("user.dir") + "/videos");
            Files.createDirectories(paths);
            Path videolocname=Paths.get(paths.toString(),String.format("%s-%d.%s","test",System.currentTimeMillis(),".mp4"));
            Files.write(videolocname,dec);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
