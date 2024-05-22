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


public class Textvalidation extends base {
    @Test
    public void textvalidationafterlongclick() {
        startrecording();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
        WebElement Check = driver.findElement(By.id("io.appium.android.apis:id/check1"));
        driver.executeScript("mobile:longclickGesture", ImmutableMap.of("elementId", (RemoteWebElement) Check, "duration", 2000));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
        driver.findElement(By.xpath("io.appium.android.apis:id/edit")).sendKeys("Hello");
        WebElement Check1=driver.findElement(By.id("io.appium.android.apis:id/check1"));
        Check1.click();
        boolean result= Check.isSelected();
        System.out.println(result);
        stoprecording();

    }
}

