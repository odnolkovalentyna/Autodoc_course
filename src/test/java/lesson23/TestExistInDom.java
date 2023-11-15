package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

import static org.testng.AssertJUnit.fail;

public class TestExistInDom extends WebDriverInit {


    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua");

        List<WebElement> logo = driver.findElements(By.xpath("//a[@class='header__logo']"));
        if (logo.size() > 0) {
            System.out.println("Logo appeared");
        } else {
            fail("logo doesn't appeared");
        }

    }
}
