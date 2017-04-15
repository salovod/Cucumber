package basic;

/**
 * Created by Sacred on 15.04.2017.
 */

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Sacred on 15.04.2017.
 */
public class RozHomepage {


    final String iPad2Text = "Apple A1490 iPad mini 2 Wi-Fi 4G 32GB (ME824TU/A) Silver официальная гарантия!";
    private SelenideElement searchInputField = $("[name='text']");

    @Before("@web")
    public void beforeScenario() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
    }

    @After("@web")
    public void afterScenario() {
        close();
    }

    @Given("^As a user I want to navigate to '(.*)'")
    public void asAUserIWantToNavigateToRozetka(String url) {
        open(url);
    }

    @When("^I can search for tablet$")
    public void iCanSearchForTablet() throws Throwable {
        searchInputField.val("iPad 2").pressEnter();
    }

    @Then("^I can found tablet$")
    public void iCanFoundTablet() throws Throwable {
        $("[alt='" + iPad2Text + "'").shouldBe(visible);
    }
}
