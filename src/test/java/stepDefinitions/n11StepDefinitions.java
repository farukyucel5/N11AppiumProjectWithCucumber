package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.n11Pages;
import util.DriverFactory;
public class n11StepDefinitions {
    n11Pages n11Pages = new n11Pages(DriverFactory.initializeTheN11Driver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklama();
    }

    @When("TelefonveAksesuarlari Secilir")
    public void telefonveaksesuarlariSecilir() {
        n11Pages.telefonVeAksesuarSecimi();
    }

    @When("Cep telefonu secilir")
    public void cepTelefonuSecilir() {
        n11Pages.cepTelefonuSecimi();
    }

    @When("Marka secilir")
    public void markaSecilir() {
        n11Pages.markaSecimi();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {
        n11Pages.filtrelemeTiklama();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        n11Pages.filtrelemeYap();
    }

    @When("Sonuclarigostere tiklanir")
    public void sonuclarigostereTiklanir() {
        n11Pages.sonuclariGosterTiklama();
    }

    @And("artı butonuna basılır")
    public void artıButonunaBasılır() {
        n11Pages.addToBasketPlusButton();
    }

    @Then("Sepete ikonuna basilir")
    public void sepeteIkonunaBasilir() {
        n11Pages.goToTheCart();

    }



    @When("Urun detayına gidilir")
    public void urunDetayınaGidilir() {
        n11Pages.urunDetaySayfasinaTiklama();

    }


    @Then("Sepete urun eklenir")
    public void sepeteUrunEklenir() {
        n11Pages.sepetEklemeTiklama();

    }

    @And("filtrelenen urunun mavi ve {int}GB  oldugu dogrulanir")
    public void filtrelenenUrununMaviVeGBOlduguDogrulanir(int arg0) {
        Assert.assertTrue(n11Pages.urunTextiAlinir().contains("Mavi"));
        Assert.assertTrue(n11Pages.urunTextiAlinir().contains("128 GB"));
    }


    @Then("uygulama kapatilir")
    public void uygulamaKapatilir() {
        DriverFactory.closeDriver();
    }


    @Given("arama kutusuna tiklanir")
    public void aramaKutusunaTiklanir() {
        n11Pages.clickSearchBox();
    }

    @And("{string} yazilir ve arama yapilir")
    public void yazilirVeAramaYapilir(String productName) {
        n11Pages.typeSearchBoxAndHitEnter(productName);
    }

    @Then("Arama sonuclarinin {string} icerdigi dogrulanır")
    public void aramaSonuclarininIcerdigiDogrulanır(String productName) {
        n11Pages.verifyTheProductsListedContainLenovo(productName);

    }


}
