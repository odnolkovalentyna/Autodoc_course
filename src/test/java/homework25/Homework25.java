package homework25;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class Homework25 extends WebDriverInit {
    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By POPUP = By.xpath("//span[@class='exponea-close']");
    private final By LOGIN = By.xpath("//button[@class='header__button ng-star-inserted']");
    private final By REG = By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    private final By LINK = By.xpath("//div/p/a[@target='_blank']");
    private final By TITLE = By.xpath("//div[@class='rz-text']/h1/strong");
    private final By INFO_DELETION = By.xpath("(//tr/td[@data-label='Masz prawo'])[5]");
    private final String EXPECTED_URL_OF_PP = "https://rozetka.pl/pages/privacy_policy/";
    private final String EXPECTED_TITLE = "Polityka prywatności Rozetka EU Sp. z o.o.";
    private final String EXPECTED_INFO_DELETION = "Prawo żądania usunięcia Danych";


    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement loginBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(LOGIN));
        loginBtn.click();
        WebElement regBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(REG));
        regBtn.click();
        WebElement linkOfPp = webDriverWait.until(ExpectedConditions.elementToBeClickable(LINK));
        linkOfPp.click();

        //проверка что пользовательское соглашение открылось в новом окне
        Set<String> handles = driver.getWindowHandles();
        List<String> listHandles = new ArrayList<>(handles);
        driver.switchTo().window(listHandles.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), EXPECTED_URL_OF_PP);

        closePopUp(POPUP);

        //проверка что тайтл "Polityka prywatności Rozetka EU Sp. z o.o."
        WebElement mainTitle = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(TITLE));
        webDriverWait.until(ExpectedConditions.visibilityOf(mainTitle));
        Assert.assertEquals(mainTitle.getText(), EXPECTED_TITLE);

        //проверка информации на право удаления "Prawo żądania usunięcia Danych"
        WebElement ruleDeletion = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(INFO_DELETION));
        Assert.assertEquals(ruleDeletion.getText(), EXPECTED_INFO_DELETION);

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
