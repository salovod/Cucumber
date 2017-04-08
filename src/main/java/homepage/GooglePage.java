package homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class GooglePage {

    WebDriver driver;

    @Given("^I am simple user$")
    public void iAmSimpleUser() {
    }

    @When("^I enter some query$")
    public void enterSomeQuery() {
        driver.findElement(By.id("lst-ib")).sendKeys("test");
    }

    @Then("^I see result$")
    public void the_result_should_be(String expectedResult) {
        driver.findElements(By.cssSelector("h3 > a")).get(0).click();
    }
}
