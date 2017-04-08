package preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class ChooseDriver {

    public static WebDriver driver;

    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.get("http://google.com");
    }
}
