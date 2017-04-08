import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homepage.GooglePage;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 08.04.2017.
 */
public class TestRunner extends DriverConfiguration {

    GooglePage googlePage = new GooglePage();


    @Given("^I am simple user$")
    public void iAmSimpleUser() {

    }

    @When("^I enter some query$")
    public void iEnterSomeQuery() throws Throwable {
        googlePage.enterSomeQuery();
    }

    @Then("^I see result$")
    public void iSeeResult() {
        googlePage.the_result_should_be("fdsdfsgfdg");
    }

}
