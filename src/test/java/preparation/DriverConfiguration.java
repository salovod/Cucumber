package preparation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static preparation.ChooseDriver.driver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class DriverConfiguration {

    ChooseDriver chooseDriver = new ChooseDriver();

    @Before
    public void before() {
        chooseDriver.openBrowser();
    }


    @After
    public void after() {
        driver.close();
    }

    @Test
    public void ffg() {
    }
}
