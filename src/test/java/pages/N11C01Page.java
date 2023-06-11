package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ReuseableMethods;

import java.time.Duration;
import java.util.List;

public class N11C01Page {

    AndroidDriver driver;
    WebDriverWait wait;
    ReuseableMethods reuseableMethods;

    By searchBox= AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBar=AppiumBy.id("com.dmall.mfandroid:id/etSearch");
    By theFirstProduct=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivAddToBasket'])[1]");
    By sepetim=AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepetim\")");

    By odemeyeGec=AppiumBy.androidUIAutomator("new UiSelector().text(\"Ödemeye Geç\")");

    By productSearchedFor=AppiumBy.androidUIAutomator("new UiSelector().text(\"Huawei FreeBuds 5i Bluetooth Kulak İçi Kulaklık\")");

    By secondProduct=AppiumBy.androidUIAutomator("new UiSelector().text(\"Qcy T5 Bluetooth 5.1 Kulak İçi Kulaklık\")");


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
            }
        }

    }

    public void clickOnTheElement(String element){
        switch (element){
            case "first product"-> reuseableMethods.findingElement(theFirstProduct).click();
            case "sepetim"-> reuseableMethods.findingElement(sepetim).click();
            case "Kategoriler"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Kategoriler")).click();
            case "Otomotiv & Motosiklet"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Otomotiv & Motosiklet")).click();
            case "Yedek Parça"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Yedek Parça")).click();
            case "Egzoz"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Egzoz")).click();
            case "Filtrele"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Filtrele")).click();
            case "Teslimat Adresi Seç"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Teslimat Adresi Seç")).click();
            case "Şehir Seç"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Şehir Seç")).click();
            case "İlçe Seç"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("İlçe Seç")).click();
            case "Sonuçları Göster"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Sonuçları Göster")).click();
            case "Onayla"->reuseableMethods.
                    findingElement(reuseableMethods.locateElementByText("Onayla")).click();

        }
    }

    public void verification(String element){
        switch (element){
            case "Ödemeye Geç"-> Assert.
                    assertTrue(reuseableMethods.findingElement(odemeyeGec).isDisplayed());
            case "AYNI GÜN TESLİMAT"->{
                List<WebElement> ayniGunTagList=driver.
                        findElements(reuseableMethods.locateElementByText("AYNI GÜN TESLİMAT"));
               // for (WebElement each:ayniGunTagList) {
               //     Assert.assertEquals(each.getText(),"AYNI GÜN TESLİMAT");
               // }
                ayniGunTagList.forEach(each->Assert.assertEquals(each.getText(),"AYNI GÜN TESLİMAT"));
            }
        }
    }

    public void scrollDown(String element){
       switch (element){
           case "Huawei"->reuseableMethods.scrollForMobile(productSearchedFor);
           case "Qcy" ->reuseableMethods.scrollTo("Qcy T5 Bluetooth 5.1 Kulak İçi Kulaklık");
           case "İstanbul"->{
               reuseableMethods.scrollTo("İstanbul");
               reuseableMethods.findingElement(reuseableMethods.locateElementByText("İstanbul")).click();
           }
           case "Beşiktaş"->{
               reuseableMethods.scrollTo("Beşiktaş");
               reuseableMethods.findingElement(reuseableMethods.locateElementByText("Beşiktaş")).click();
           }
       }
    }


}
