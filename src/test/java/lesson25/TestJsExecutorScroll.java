package lesson25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestJsExecutorScroll extends WebDriverInit {


    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)", "");

        Thread.sleep(5000);

    }



}