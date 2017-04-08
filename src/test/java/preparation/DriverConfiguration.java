package preparation;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 08.04.2017.
 */
public class DriverConfiguration {


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
