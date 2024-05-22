//package virtualsetup;
//
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobilePlatform;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//
//public class configvirtualdevices {
//
//    public static void main(String[] args) throws MalformedURLException {
//
//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("automationName","UiAutomator2");
//        capabilities.setCapability("platformVersion","14");
//        capabilities.setCapability("udid","emulator-5554");
//        capabilities.setCapability("deviceName","Nothing phone(1)");
//        capabilities.setCapability("appPackage","com.google.android.calculator");
//        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
//
//        URL url =new URL("http://127.0.0.1:4723/");
//        System.out.println("Appium started");
//        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url,capabilities);
//
////        MobileElement nine=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"9\"]"));
////        MobileElement plus=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]"));
////        MobileElement eight=driver.findElement(By.xpath("\t\n" +
////                "//android.widget.ImageButton[@content-desc=\"8\"]"));
////        nine.click();
////        plus.click();
////        eight.click();
//
//
//
//    }
//}
