package homeworks.homework29;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ChildCategoriesLocators {

    final SelenideElement BUTTON_TO_BUY = $(byXpath("//div[@class='goods-tile__content']/div[@class='goods-tile__prices']/div/app-buy-button"));
    final SelenideElement ICON_BASKET = $(byXpath("//span[@class='badge badge--green ng-star-inserted']"));
    final SelenideElement TITLE_OF_FIRST_PRODUCT = $(byXpath("//div[@class='goods-tile__content']/a/span"));
}
