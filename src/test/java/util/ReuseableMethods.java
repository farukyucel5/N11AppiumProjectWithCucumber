package util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class ReuseableMethods {
    AndroidDriver driver;
    WebDriverWait wait;
    Actions action;

    public ReuseableMethods(AndroidDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        this.action = new Actions(driver);

    }
    public WebElement presenceElement(By key){

        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findingElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void clickAndScroll(String textFromOutside){

        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");
        driver.findElement(permissionElement).click();

    }
    public By locateElementByText(String text){

        return AppiumBy.androidUIAutomator("new UiSelector().text(\""+text+"\")");
    }

    public String scrollToelementAndGetText(String textFromOutside){

        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");

         return driver.findElement(permissionElement).getText();
    }

    public void scrollTo(String textFromOutside){
        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");

          driver.findElement(permissionElement);

    }

    public  void scrollForMobile(By by) {
        String previousPageSource = "";
        while (isElementNotEnabled(by) && isNotEndOfPage(previousPageSource)) {
            previousPageSource = driver.getPageSource();
            performScroll();
        }
    }

    public void scrollForMobile(WebElement element) {
        String previousPageSource = "";
        while (isElementNotEnabled(element) && isNotEndOfPage(previousPageSource)) {
            previousPageSource = driver.getPageSource();
            performScroll();
        }
    }

    private  boolean isNotEndOfPage(String previousPageSource) {
        return !previousPageSource.equals(driver.getPageSource());
    }

    private  boolean isElementNotEnabled(WebElement element) {
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    private  boolean isElementNotEnabled(By by) {
        List<WebElement> elements = driver.findElements(by);
        return elements.isEmpty();
    }

     public   void performScroll() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int endX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endY = (int) (size.getHeight() * 0.25);

        performScrollUsingSequence(startX, startY, endX, endY);
    }

    private  void performScrollUsingSequence(int startX, int startY, int endX, int endY) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "first-finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        ((AppiumDriver)(driver)).perform(Collections.singletonList(sequence));
    }

}
