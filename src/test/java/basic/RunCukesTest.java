package basic;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {}
)
public class RunCukesTest {


    @Before
    public void before() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        open("http://google.com");
    }

    @After
    public void after() {
        close();
    }

}