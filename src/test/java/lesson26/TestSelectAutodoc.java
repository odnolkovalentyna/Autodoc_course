package lesson26;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelectAutodoc extends WebDriverInit {

    //select[@id='form_maker_id']

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        WebElement cookiesNotification = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }


        getMarkByValue(driver,"2");

    }

    private void getMarkByValue(WebDriver driverFromTest, String markValue) throws InterruptedException {
        WebElement makerList = driverFromTest.findElement(By.id("form_maker_id"));
        String markOptionValue = String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value='%TestSuccessRegWithoutPojo']",markValue);
        WebElement makerListOption = driverFromTest.findElement(By.xpath(markOptionValue));
        makerList.click();
        makerListOption.click();

        Thread.sleep(5000);
    }


}
