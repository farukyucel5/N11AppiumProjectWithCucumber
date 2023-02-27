package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ReuseableMethods;

import java.time.Duration;
import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ReuseableMethods reuseableMethods;
    By kategorilerbutonu = AppiumBy.androidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By apple = AppiumBy.androidUIAutomator("new UiSelector().text(\"Apple\")");
    By filtrele = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterRL\")");
    By dahiliHafiza = AppiumBy.androidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By gb = AppiumBy.androidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButonu = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/applyBtn\")");
    By model = AppiumBy.androidUIAutomator("new UiSelector().text(\"Model\")");
    By iphone = AppiumBy.androidUIAutomator("new UiSelector().text(\"Iphone 13\")");
    By mavi = AppiumBy.androidUIAutomator("new UiSelector().text(\"Mavi\")");
    By sonucGoster = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
    By urunTextButonu = AppiumBy.id("com.dmall.mfandroid:id/tvTitle");

    By sepeteEkle = AppiumBy.id("com.dmall.mfandroid:id/pdpAddToCartButton");

    By addToBasket1=AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");

    By continueToBasketButton =AppiumBy.id("com.dmall.mfandroid:id/continueButton");

    By cartIcon = AppiumBy.accessibilityId("Sepetim, 1 yeni bildirim");
    By productText = AppiumBy.id("com.dmall.mfandroid:id/skuOptionsTV");


    //==================================scenarion2====================================================\\

    By searchBar = AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBox = AppiumBy.id("com.dmall.mfandroid:id/etSearch");

    By searchElement = AppiumBy.id("com.dmall.mfandroid:id/keywordTV");

    By  ad= AppiumBy.id("com.dmall.mfandroid:id/dialogImageView");

    By navigateBack= AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    By price =AppiumBy.xpath("//android.widget.TextView[@text='21153 TL ve altı']");

    By filteredProductList=AppiumBy.id("com.dmall.mfandroid:id/tvTitle");


    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.reuseableMethods = new ReuseableMethods(driver);
    }

    public void kategoriTiklama() {
        reuseableMethods.findingElement(kategorilerbutonu).click();
    }

    public void elektronikTiklama() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(1).click();
    }

    public void telefonVeAksesuarSecimi() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(0).click();
    }

    public void cepTelefonuSecimi() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(0).click();
    }

    public void markaSecimi() {
        reuseableMethods.findingElement(apple).click();
    }

    public void filtrelemeTiklama() {
        reuseableMethods.findingElement(filtrele).click();
    }

    public void filtrelemeYap() {
        reuseableMethods.findingElement(dahiliHafiza).click();
        reuseableMethods.findingElement(gb).click();
        reuseableMethods.findingElement(uygulaButonu).click();
        reuseableMethods.findingElement(model).click();
        reuseableMethods.findingElement(iphone).click();
        reuseableMethods.findingElement(uygulaButonu).click();
        reuseableMethods.clickAndScroll("Renk");
        reuseableMethods.findingElement(mavi).click();
        reuseableMethods.findingElement(uygulaButonu).click();
    }

    public void sonuclariGosterTiklama() {
        reuseableMethods.findingElement(sonucGoster).click();

    }

    public void addToBasketPlusButton() {
       reuseableMethods.findingElement(addToBasket1).click();

    }

    public void urunDetaySayfasinaTiklama(){
        reuseableMethods.findingElement(urunTextButonu).click();
    }
    public void sepetEklemeTiklama() {
        reuseableMethods.findingElement(sepeteEkle).click();

    }


    public void goToTheCart(){
        //driver.findElement(cartIcon).click();
        reuseableMethods.findingElement(cartIcon).click();

    }

    public String urunTextiAlinir() {
        reuseableMethods.scrollTo("Aras Kargo: Kargon Ücretsiz!");
        return reuseableMethods.findingElement(productText).getText();
    }

    //========================================scenario2==============================================\\

    public void clickSearchBox() {
            reuseableMethods.findingElement(searchBar).click();
    }

    public void typeSearchBoxAndHitEnter(String text) {
        reuseableMethods.findingElement(searchBox).clear();
       reuseableMethods.findingElement(searchBox).sendKeys(text, Keys.ENTER);
        reuseableMethods.findingElement(searchElement).click();
    }

    public void verifyTheProductsListedContainLenovo(String productName){
        reuseableMethods.findingElement(price).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(filteredProductList));
        List<WebElement> productList =driver.findElements(filteredProductList);
        productList.forEach(each-> System.out.println(each.getText()));
        productList.forEach(each-> Assert.assertTrue(each.getText().toLowerCase().contains(productName)));
    }


}
