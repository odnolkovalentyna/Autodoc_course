package lesson25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestScrollViaJs extends WebDriverInit {


    @Test
    public void testIsSelected() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Are you sure?')");

        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

       //prompt("Please enter your name", "Harry Potter");
        //confirm("Press a button!\nEither OK or Cancel.")
    }

}
