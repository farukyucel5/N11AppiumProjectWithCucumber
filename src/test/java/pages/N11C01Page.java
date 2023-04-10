package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ReuseableMethods;

import java.time.Duration;

public class N11C01Page {

    AppiumDriver driver;
    WebDriverWait wait;
    ReuseableMethods reuseableMethods;

    public N11C01Page(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.reuseableMethods = new ReuseableMethods(driver);
    }

    By searchBox= AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBar=AppiumBy.id("com.dmall.mfandroid:id/etSearch");

    By searchElement=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/keywordTV'])[2]");


    public void typeIn(String text){
        switch (text){
            case "Kulaklik"-> {
                reuseableMethods.findingElement(searchBox).click();
                reuseableMethods.findingElement(searchBar).sendKeys(text);
                reuseableMethods.findingElement(searchElement).click();
            }
        }

    }


}
