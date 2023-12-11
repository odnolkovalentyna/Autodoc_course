package homeworks.homework29;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pattern.pageObject.selenide.SearchPageLogic;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPage extends MainPageLocators {


    public MainCategories chooseMainCategory(){
        MAIN_CATEGORY.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return page(MainCategories.class);
    }

    public MainPage closePopUpCookies() {
        try {
            COOKIES.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
        return this;
    }
    public MainPage closeAdPopup() {
        try {
            POPUP.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
        return this;
    }
}
