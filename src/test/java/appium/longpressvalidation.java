package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class longpressvalidation {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","Uiautomator2");
        capabilities.setCapability("platformVersion","14.0");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","C:\\Users\\venka\\Downloads\\ApiDemos-debug.apk");
        capabilities.setCapability("deviceName","Emulator");
        URL url = new URL("http://127.0.0.1:4723/");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        ((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", ImmutableMap.of("elementId",(RemoteWebElement) ele,"duration",2000));



    }
}
