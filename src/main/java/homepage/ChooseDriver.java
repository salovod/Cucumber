package homepage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class ChooseDriver {

    public static WebDriver driver;

    public void openBrowser() {
        ChromeDriverManager.getInstance().setup();
        driver.get("http://google.com");
    }
}
