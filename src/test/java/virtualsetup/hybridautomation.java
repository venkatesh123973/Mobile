package virtualsetup;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Set;

public class hybridautomation extends base{

    @Test
    public void letsshop() throws InterruptedException {
        startrecording();
        driver.findElement(By.id("android:id/text1")).click();
        scrollelement("Kiribati");
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rama");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Air Jordan 1 Mid SE\"]//following::android.widget.TextView[@text=\"ADD TO CART\"][1]")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(5000);
        Set<String> contextname=driver.getContextHandles();
//        for(String contet:contextname){
//            System.out.println(contet);
//        }

        driver.context("WEBVIEW_com.androidsample.generalstore");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("rama");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");
       stoprecording();


        
    }
}
