package pattern.pageObject.selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPageLocators {

    ElementsCollection titleOfAllProducts = $$(byXpath("//span[contains(@class, 'badge badge')]"));
}
