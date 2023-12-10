package pattern.pageObject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPageLocators {

    SelenideElement compAndLaptopCategory = $(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
    ElementsCollection sideBarCategories = $$(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));

}
