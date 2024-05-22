package appium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class swipegesture extends base {

    @Test
    public void swipe(){
        startrecording();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        scrollelement("Gallery");
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstimage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        String foc=firstimage.getAttribute("focusable");
        Assert.assertEquals("true",foc);
        ((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",(RemoteWebElement) firstimage,"direction","left","percent",0.75));
        Assert.assertEquals("false",foc);
        stoprecording();

    }
}
