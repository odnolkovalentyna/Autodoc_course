package homeworks.homework29;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {


    final SelenideElement COOKIES = $(byXpath("//button[@class='button button_size_large button_color_green']"));
    final SelenideElement MAIN_CATEGORY = $(byXpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class, 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]"));
    final SelenideElement POPUP = $(byXpath("//span[@class='exponea-close']"));


}
