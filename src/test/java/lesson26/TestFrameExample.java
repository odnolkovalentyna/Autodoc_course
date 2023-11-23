package lesson26;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class TestFrameExample extends WebDriverInit {

    @org.testng.annotations.Test
    public void testFrame() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);
        WebElement inputInFrame = driver.findElement(By.id("tinymce"));
        sleep(5000);
        inputInFrame.clear();
        inputInFrame.sendKeys("Hello world. I am here");
        sleep(5000);

    }
}

