package rozetka;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 15.04.2017.
 */
public class RozHomepage {

    final String iPad2Text = "Apple A1490 iPad mini 2 Wi-Fi 4G 32GB (ME824TU/A) Silver официальная гарантия!";
    private SelenideElement searchInputField = $("[name='text']");

    @Given("^As a user I want to navigate to rozetka$")
    public void asAUserIWantToNavigateToRozetka() throws Throwable {
        open("http://rozetka.com.ua/");
    }

    @When("^I can search for tablet$")
    public void iCanSearchForTablet() throws Throwable {
        searchInputField.val("iPad 2").pressEnter();
    }

    @Then("^I can found tablet$")
    public void iCanFoundTablet() throws Throwable {
        $("[alt='Apple A1490 iPad mini 2 Wi-Fi 4G 32GB (ME824TU/A) Silver официальная гарантия!'").shouldBe(visible);
    }
}
