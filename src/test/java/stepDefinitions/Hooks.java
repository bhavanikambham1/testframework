package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testBase.BaseClass;

public class Hooks {

    @Before
    public void startTest() {
        BaseClass.setUp();
    }

    @After
    public void endTest() {
        BaseClass.tearDown();
    }

}
