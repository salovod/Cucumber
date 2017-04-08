package basic;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {}
)
public class RunCukesTest {

}