package homepage;

import org.openqa.selenium.By;

import static homepage.ChooseDriver.driver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class GooglePage {


    ChooseDriver chooseDriver = new ChooseDriver();

    public void iAmSimpleUser() {
        chooseDriver.openBrowser();
    }
    public void enterSomeQuery() {
        driver.findElement(By.id("lst-ib")).sendKeys("test");
    }

    public void the_result_should_be(String expectedResult) {
        driver.findElements(By.cssSelector("h3 > a")).get(0).click();
    }
}
