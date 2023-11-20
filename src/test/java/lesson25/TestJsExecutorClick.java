package lesson25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestJsExecutorClick extends WebDriverInit {
    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By POPUP = By.xpath("//span[@class='exponea-close']");
    private final By SEARCH = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']");
    private final By SEARCH_INPUT = By.name("search");


    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement searchBtn = webDriverWait.until(ExpectedConditions
                .elementToBeClickable(SEARCH));
        WebElement input = driver.findElement(SEARCH_INPUT);
        input.sendKeys("Mac");
       // searchBtn.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", searchBtn);



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
