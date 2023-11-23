package lesson26;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestKeysExample extends WebDriverInit {

    @Test
    public void testKeys() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        sleep(50000);
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(Keys.chord(Keys.SHIFT,"mac"));
        sleep(5000);
        searchInput.sendKeys(Keys.ENTER);
        sleep(5000);
    }
    public void changeCFCookie(String value){
        Cookie cookie = new Cookie("cf_clearance",value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }
}
