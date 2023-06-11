package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ReuseableMethods;

import java.time.Duration;

public class KeyEventsPage {
    AndroidDriver driver;
    ReuseableMethods reuseableMethods;

    WebDriverWait wait;

    public KeyEventsPage(AndroidDriver driver){
        this.driver=driver;
        this.reuseableMethods=new ReuseableMethods(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By searchBox= AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBar=AppiumBy.id("com.dmall.mfandroid:id/etSearch");

    public void clickOnTheSearchBox(){
        reuseableMethods.findingElement(searchBox).click();
    }
    public void typeIn(String text){
        reuseableMethods.findingElement(searchBar).sendKeys(text);
    }

    public void pressOnTheKey(String key){
        switch (key){
            case "Space"->driver.pressKey(new KeyEvent(AndroidKey.SPACE));
            case "Backspace"->driver.pressKey(new KeyEvent(AndroidKey.BACK));
            case "Enter"-> driver.pressKey(new KeyEvent(AndroidKey.ENTER));
            case "Tab"->driver.pressKey(new KeyEvent(AndroidKey.TAB));
        }
    }
}
