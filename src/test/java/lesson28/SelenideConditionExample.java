package lesson28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class SelenideConditionExample {

    SelenideElement cookies = $x("//button[@data-cookies='allow_all_cookies']");
    SelenideElement search = $x("//div[@class='header-search__input']/input");
    SelenideElement btnSearch = $x("//span[@class='header-search__button btn btn--md']/span");

    @Test
    public void testSelenide() {
        open("https://new.autodoc.de/");
        cookies.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        search.setValue("123");
        btnSearch.shouldHave(Condition.text("Suchen")).click();
        sleep(2000);
    }
}
