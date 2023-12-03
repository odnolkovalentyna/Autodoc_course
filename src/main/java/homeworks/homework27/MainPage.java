package homeworks.homework27;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends MainPageLocators{
    protected WebDriverWait webDriverWait;

    public MainPage(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public MainCategories chooseMainCategory(){
        WebElement komputeryIlaptopy =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(MAIN_CATEGORY));
        komputeryIlaptopy.click();
        return new MainCategories(webDriverWait);
    }

    public MainPage closePopUpCookies() {
        try {
            WebElement popupElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(COOKIES));
            popupElement.click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
        return this;
    }
    public MainPage closeAdPopup() {
        try {
            WebElement popupElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(POPUP));
            popupElement.click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
        return this;
    }
}
