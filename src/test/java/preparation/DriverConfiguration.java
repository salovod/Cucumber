package preparation;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 08.04.2017.
 */
public class DriverConfiguration {


    @Before("@web")
    public void beforeScenario() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        open("http://google.com");
    }

    @After("@web")
    public void afterScenario() {
        close();
    }
}
