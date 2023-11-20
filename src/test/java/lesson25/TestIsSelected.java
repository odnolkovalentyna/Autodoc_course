package lesson25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class TestIsSelected extends WebDriverInit {

    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By POPUP = By.xpath("//span[@class='exponea-close']");
    private final By LOGIN = By.xpath("//button[@class='header__button ng-star-inserted']");
    private final By CHECK_BOX_INPUT = By.id("remember_me");
    private final By CHECK_BOX = By.id("//label[@class='auth-modal__remember-checkbox']");


    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement loginBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(LOGIN));
        loginBtn.click();

        Thread.sleep(2000);
        WebElement rememberCheckBoxInput =  driver.findElement(CHECK_BOX_INPUT);
        WebElement rememberChekBox = driver.findElement(CHECK_BOX);
        System.out.println(rememberCheckBoxInput.isSelected());
        rememberChekBox.click();
        System.out.println(rememberCheckBoxInput.isSelected());

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


