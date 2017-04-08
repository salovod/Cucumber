package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 08.04.2017.
 */
public class GooglePage {

    WebDriver driver;

    public void iAmSimpleUser() {
    }
    public void enterSomeQuery() {
        driver.findElement(By.id("lst-ib")).sendKeys("test");
    }

    public void the_result_should_be(String expectedResult) {
        driver.findElements(By.cssSelector("h3 > a")).get(0).click();
    }
}
