package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AndroidKeyPage;
import util.DriverFactory;

public class AndroidKeySteps {
    AndroidKeyPage androidKeyPage=new AndroidKeyPage(DriverFactory.driver);
    @Given("type {string} in the searchBox")
    public void typeInTheSearchBox(String text) {
        androidKeyPage.typeIn(text);
    }

    @And("press on the key {string}")
    public void pressOnTheKey(String key) {
        androidKeyPage.pressOnTheKey(key);

    }

    @Given("Click on the searchbox")
    public void clickOnTheSearchbox() {
        androidKeyPage.activateTheSearchBox();
    }
}
