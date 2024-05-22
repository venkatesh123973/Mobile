package virtualsetup;

import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dropdown extends base {

    @Test
    public void dropdownvalidation(){

        driver.findElement(By.id("android:id/text1")).click();
        scrollelement("Kiribati");
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rama");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();

        TouchAction touchAction = new TouchAction(driver);



    }

}
