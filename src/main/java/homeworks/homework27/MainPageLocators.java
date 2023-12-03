package homeworks.homework27;

import org.openqa.selenium.By;

public class MainPageLocators {

    final String QUANTITY_OF_GOODS = "1";
    final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    final By MAIN_CATEGORY = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class, 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]");




    final By POPUP = By.xpath("//span[@class='exponea-close']");


}
