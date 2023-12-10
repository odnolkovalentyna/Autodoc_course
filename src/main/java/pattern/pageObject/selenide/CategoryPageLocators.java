package pattern.pageObject.selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPageLocators {

    SelenideElement laptopSubCategory = $(byXpath("(//a[contains(@href, 'c80004/')])[1]"));
}
