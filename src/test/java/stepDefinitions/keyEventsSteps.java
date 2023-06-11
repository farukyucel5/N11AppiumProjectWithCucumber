package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.KeyEventsPage;
import util.DriverFactory;

public class keyEventsSteps {
    KeyEventsPage keyEventsPage=new KeyEventsPage(DriverFactory.driver);
    @Given("Click on the search box")
    public void clickOnTheSearchBox() {
        keyEventsPage.clickOnTheSearchBox();
    }

    @And("type {string} in the search box")
    public void typeInTheSearchBox(String text) {
        keyEventsPage.typeIn(text);
    }

    @Then("press on the key {string}")
    public void pressOnTheKey(String key) {
        keyEventsPage.pressOnTheKey(key);
    }
}
