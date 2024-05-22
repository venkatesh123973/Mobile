package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class scrolldown {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("platformVersion","14");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("deviceName","Emulator");
        capabilities.setCapability("app","C:\\Users\\venka\\Downloads\\ApiDemos-debug.apk");
        URL url =new URL("http://127.0.0.1:4723/");
        System.out.println("Appium started");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Picker\"));")).click();
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Picker\").instance(0))").click();

       //Scroll down still

        boolean scroll=(Boolean)((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of("left",100,"top",100,"width",100,"height",100,"direction","down","percent",3.0));
    }
}
