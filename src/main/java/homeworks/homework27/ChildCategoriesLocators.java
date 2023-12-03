package homeworks.homework27;

import org.openqa.selenium.By;

public class ChildCategoriesLocators {
    final By BUTTON_TO_BUY = By.xpath("//div[@class='goods-tile__content']/div[@class='goods-tile__prices']/div/app-buy-button");
    final By ICON_BASKET = By.xpath("//span[@class='badge badge--green ng-star-inserted']");
    final By TITLE_OF_FIRST_PRODUCT = By.xpath("//div[@class='goods-tile__content']/a/span");
}
