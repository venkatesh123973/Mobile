package appium;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Textvalidation {
     @Test
      public void test() throws MalformedURLException {
        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\venka\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).withArgument(() -> "--base-path", "/").withTimeout(Duration.ofSeconds(300)).build();

        service.start();

        DesiredCapabilities capabilities =new DesiredCapabilities();
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
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
       WebElement Check=driver.findElement(By.id("io.appium.android.apis:id/check1"));
        driver.executeScript("mobile:longclickGesture", ImmutableMap.of("elementId",(RemoteWebElement) Check,"duration",2000));
//        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]").click();
//        driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Hello");
//        WebElement Check=driver.findElement(By.id("io.appium.android.apis:id/check1"));
//        Check.click();
//       boolean result= Check.isSelected();
//        System.out.println(result);


    }}

