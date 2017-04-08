package homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sacred on 08.04.2017.
 */
public class GooglePageScenario {

    GooglePage googlePage = new GooglePage();


    @Given("^I am simple user$")
    public void iAmSimpleUser() {
    }

    @When("^I enter some query$")
    public void enterSomeQuery() {
        googlePage.enterSomeQuery();
    }

    @Then("^I see result$")
    public void the_result_should_be(String expectedResult) {
        googlePage.the_result_should_be("fdsdfsgfdg");
    }
}
