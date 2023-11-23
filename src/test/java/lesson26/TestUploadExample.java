package lesson26;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;


public class TestUploadExample extends WebDriverInit {

    @org.testng.annotations.Test
    public void testUpload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadElement.sendKeys("C:\\Users\\Valentyna\\IdeaProjects\\Autodoc_course\\somefile.txt");
        uploadBtn.click();
        sleep(5000);

    }
}
