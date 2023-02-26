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
    By renk = AppiumBy.androidUIAutomator("new UiSelector().text(\"Renk\")");
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

        //driver.findElement(kategorilerbutonu).click();
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

        //driver.findElement(apple).click();
        reuseableMethods.findingElement(apple).click();
    }

    public void filtrelemeTiklama() {

        //driver.findElement(filtrele).click();
        reuseableMethods.findingElement(filtrele).click();
    }

    public void filtrelemeYap() {
       //driver.findElement(dahiliHafiza).click();
       //driver.findElement(gb).click();
       //driver.findElement(uygulaButonu).click();
       //driver.findElement(model).click();
       //driver.findElement(iphone).click();
       //driver.findElement(uygulaButonu).click();
       //reuseableMethods.clickAndScroll("Renk");
       //driver.findElement(mavi).click();
       //driver.findElement(uygulaButonu).click();
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
        //driver.findElement(sonucGoster).click();
        reuseableMethods.findingElement(sonucGoster).click();

    }

    public void addToBasketPlusButton() {

      // driver.findElement(addToBasket1).click();
       reuseableMethods.findingElement(addToBasket1).click();

    }

    public void tekrarRenkVeHfizaSecimiYap() {
       // driver.findElement(mavi).click();
       // driver.findElement(gb).click();
       // driver.findElement(continueToBasketButton).click();
        reuseableMethods.findingElement(mavi).click();
        reuseableMethods.findingElement(gb).click();
        reuseableMethods.findingElement(continueToBasketButton).click();
    }

    public void urunDetaySayfasinaTiklama(){
       // wait.until(ExpectedConditions.presenceOfElementLocated(urunTextButonu));
       // driver.findElement(urunTextButonu).click();
        reuseableMethods.findingElement(urunTextButonu).click();
    }
    public void sepetEklemeTiklama() {
        reuseableMethods.findingElement(sepeteEkle).click();
        //driver.findElement(sepeteEkle).click();

    }


    public void goToTheCart(){
        //driver.findElement(cartIcon).click();
        reuseableMethods.findingElement(cartIcon).click();

    }

    public String urunTextiAlinir() {
        reuseableMethods.scrollTo("Aras Kargo: Kargon Ücretsiz!");
        return reuseableMethods.findingElement(productText).getText();
        //    driver.findElement(productText).getText();

    }

    //========================================scenario2==============================================\\

    public void clickSearchBox() {
        try{
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.presenceOfElementLocated(ad));
            driver.findElement(ad).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(navigateBack));
            driver.findElement(navigateBack).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(searchBar));
            driver.findElement(searchBar).click();
        }catch (Exception e) {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.presenceOfElementLocated(searchBar));
            driver.findElement(searchBar).click();

        }


    }

    public void typeSearchBoxAndHitEnter(String text) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(text, Keys.ENTER);
        driver.findElement(searchElement).click();
    }

    public void verifyTheProductsListedContainLenovo(String productName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(price));
        driver.findElement(price).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(filteredProductList));
        List<WebElement> productList =driver.findElements(filteredProductList);
        productList.forEach(each-> System.out.println(each.getText()));
        productList.forEach(each-> Assert.assertTrue(each.getText().toLowerCase().contains(productName)));
    }


}
