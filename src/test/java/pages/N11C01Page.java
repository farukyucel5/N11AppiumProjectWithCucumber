package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ReuseableMethods;

import java.time.Duration;

public class N11C01Page {

    AndroidDriver driver;
    WebDriverWait wait;
    ReuseableMethods reuseableMethods;

    By searchBox= AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBar=AppiumBy.id("com.dmall.mfandroid:id/etSearch");
    By theFirstProduct=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivAddToBasket'])[1]");
    By sepetim=AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepetim\")");

    By odemeyeGec=AppiumBy.androidUIAutomator("new UiSelector().text(\"Ödemeye Geç\")");
   public N11C01Page(AndroidDriver driver){
       this.driver=driver;
       this.reuseableMethods=new ReuseableMethods(driver);
       this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));
   }

    public void typeIn(String text) {
        switch (text){
            case "Kulaklik"-> {
                reuseableMethods.findingElement(searchBox).click();
                reuseableMethods.findingElement(searchBar).sendKeys(text);
                driver.pressKey(new KeyEvent(AndroidKey.ENTER));
                driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
            }
        }

    }

    public void clickOnTheElement(String element){
        switch (element){
            case "first product"-> reuseableMethods.findingElement(theFirstProduct).click();
            case "sepetim"-> reuseableMethods.findingElement(sepetim).click();
        }
    }

    public void verification(String element){
        switch (element){
            case "Ödemeye Geç"->{
                Assert.assertTrue(reuseableMethods.findingElement(odemeyeGec).isDisplayed());
            }
        }
    }


}
