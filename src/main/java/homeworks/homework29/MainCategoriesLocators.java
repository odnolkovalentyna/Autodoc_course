package homeworks.homework29;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainCategoriesLocators {

    final SelenideElement CHILD_CATEGORY = $(byXpath("//span[text()=' Laptopy ']"));
}
