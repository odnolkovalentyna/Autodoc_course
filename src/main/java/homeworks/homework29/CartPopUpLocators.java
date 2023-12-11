package homeworks.homework29;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartPopUpLocators {
    final SelenideElement TITLE_OF_FIRST_PRODUCT_BASKET = $(byXpath("//div[@class='cart-product__main']/a"));
}
