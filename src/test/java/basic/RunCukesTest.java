package basic;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import preparation.DriverConfiguration;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {}
)
public class RunCukesTest extends DriverConfiguration {

}