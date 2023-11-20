package lesson25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles extends WebDriverInit {

    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By POPUP = By.xpath("//span[@class='exponea-close']");
    private final By LOGIN = By.xpath("//button[@class='header__button ng-star-inserted']");
    private final By REG = By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    private final By LINK = By.xpath("//div/p/a[@target='_blank']");


    @org.testng.annotations.Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement loginBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(LOGIN));
        loginBtn.click();
        Thread.sleep(2000);

        WebElement registrationBtn = driver.findElement(REG);
        registrationBtn.click();
        Thread.sleep(2000);

        WebElement privatePolicyDocBtn = driver.findElement(LINK);
        privatePolicyDocBtn.click();

        Thread.sleep(2000);

        Set<String> handles = driver.getWindowHandles();
        List<String> listHandles = new ArrayList<>(handles);

        driver.switchTo().window(listHandles.get(0));
        Thread.sleep(2000);

        driver.switchTo().window(listHandles.get(1));
        Thread.sleep(2000);
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
