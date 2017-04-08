package homepage;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Sacred on 08.04.2017.
 */
public class GooglePage {


    @Given("^I am simple user$")
    public void iAmSimpleUser() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        open("http://google.com");
    }

    @When("^I enter some query$")
    public void enterSomeQuery() {
        $("#lst-ib").val("test").pressEnter();
    }


    @Then("^I see result$")
    public void iSeeResult() {
        $$("h3 > a").get(0).click();
    }
}
