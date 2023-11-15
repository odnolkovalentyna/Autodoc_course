package lesson24;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestWithClear extends WebDriverInit {

    @Test
    public void testClear() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        closePopUp(By.id("L2AGLb"));
        WebElement inputSearch = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        inputSearch.sendKeys("Hello worls");
        sleep(5000);
        inputSearch.clear();
        sleep(5000);



    }

    // Метод для проверки наличия попапа и его закрытия
    private void closePopUp(By popupLocator) {
        try {
            WebElement popupElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(popupLocator));
            popupElement.click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
    }
}
