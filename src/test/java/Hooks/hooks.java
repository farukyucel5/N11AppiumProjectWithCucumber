package Hooks;

import io.cucumber.java.Before;
import util.DriverFactory;

public class hooks {

    @Before
    public void instantiateTheDriver(){

        DriverFactory.initializeTheN11Driver();

    }
}
