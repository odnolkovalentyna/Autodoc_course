package lesson28;



import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


public class FirstSelenideTest {

    SelenideElement cookies = $x("//button[@data-cookies='allow_all_cookies']");
    SelenideElement search = $x("//div[@class='header-search__input']/input");

    @BeforeMethod
    public void before(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=some user agent");
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities = options;
    }

    @Test
    public void testSelenide() {
        //Cookie cookie = new Cookie("cf-clearance","");


        open("https://new.autodoc.de/");
       // WebDriverRunner.getWebDriver().manage().deleteAllCookies();
       // clearBrowserCookies();
        cookies.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        search.setValue("123").pressEnter();
        sleep(2000);
    }
}
