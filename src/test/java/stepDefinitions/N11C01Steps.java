package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.N11C01Page;
import util.DriverFactory;

public class N11C01Steps {
    N11C01Page n11C01Page =new N11C01Page(DriverFactory.driver);
    @Given("Type {string} in the searchBox")
    public void typeInTheSearchBox(String element) throws InterruptedException {
        n11C01Page.typeIn(element);
    }

    @And("verify that {string} is visible")
    public void verifyThatIsVisible(String element) {
        n11C01Page.verification(element);
    }

    @And("click the {string}")
    public void clickThe(String element) {
        n11C01Page.clickOnTheElement(element);
    }

    @Then("Close the app")
    public void closeTheApp() {
        DriverFactory.closeDriver();
    }


    @And("Scroll down to the {string}")
    public void scrollDownToThe(String element) {
        n11C01Page.scrollDown(element);

    }
}
