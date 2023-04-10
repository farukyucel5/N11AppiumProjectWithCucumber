package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.N11C01Page;
import util.DriverFactory;

public class N11C01Steps {
    N11C01Page n11C01Page =new N11C01Page(DriverFactory.initializeTheN11Driver());
    @Given("Type {string} in the searchBox")
    public void typeInTheSearchBox(String element) {
        n11C01Page.typeIn(element);
    }
}
