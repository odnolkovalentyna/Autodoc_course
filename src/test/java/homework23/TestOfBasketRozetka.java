package homework23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOfBasketRozetka extends WebDriverInit {


    private final String QUANTITY_OF_GOODS = "1";
    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By MAIN_CATEGORY = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class, 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]");
    private final By CHILD_CATEGORY =  By.xpath("//span[text()=' Laptopy ']");
    private final By BUTTON_TO_BUY =  By.xpath("//div[@class='goods-tile__content']/div[@class='goods-tile__prices']/div/app-buy-button");
    private final By ICON_BASKET =  By.xpath("//span[@class='badge badge--green ng-star-inserted']");
    private final By TITLE_OF_FIRST_PRODUCT =  By.xpath("//div[@class='goods-tile__content']/a/span");
    private final By TITLE_OF_FIRST_PRODUCT_BASKET =  By.xpath("//div[@class='cart-product__main']/a");
    private final By POPUP =  By.xpath("//span[@class='exponea-close']");



    @Test
    public void addToBasket() throws InterruptedException {

        // Шаг 1: Открываем сайт
        driver.get("https://rozetka.pl/");

        // закрытие попапов
        closePopUp(COOKIES);
        closePopUp(POPUP);


        // Шаг 2: Переходим в раздел «Komputery i laptopy»
        WebElement komputeryIlaptopy =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(MAIN_CATEGORY));
        komputeryIlaptopy.click();


        // Шаг 3: Переходим в раздел «Laptopy»
        WebElement laptopy =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(CHILD_CATEGORY));
        laptopy.click();
        Thread.sleep(5000); //пришлось добавить (не нашла лучшего решения)

        // Шаг 4: Сохраняем тайтл первого товара и добавляем первый товар в корзину
        WebElement titleFromElement =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(TITLE_OF_FIRST_PRODUCT));
        String titleOfFirstProduct = titleFromElement.getText();
        WebElement buttonAddToBasket =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(BUTTON_TO_BUY));
        buttonAddToBasket.click();

        // Шаг 5: Проверяем, что в корзину добавлен один товар
        WebElement countOfGoodsInTheBasket =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(ICON_BASKET));
        String count = countOfGoodsInTheBasket.getText();
        Assert.assertEquals(count, QUANTITY_OF_GOODS,"Error in displaying the number of items added to the basket");

        // Шаг 6: Переходим в корзину и проверяем, что добавлен правильный товар
        countOfGoodsInTheBasket.click();
        Thread.sleep(5000); //пришлось добавить (не нашла лучшего решения)
        WebElement titleOfElementInTheBasket =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(TITLE_OF_FIRST_PRODUCT_BASKET));
        String titleOfFirstProductInTheBasket = titleOfElementInTheBasket.getText();

        Assert.assertEquals(titleOfFirstProductInTheBasket, titleOfFirstProduct, "The name of the product differs");
    }



    // Метод для проверки наличия попапа и его закрытия
    private void closePopUp(By popupLocator) {
        try {
            WebElement popupElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(popupLocator));
            popupElement.click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
    }
}
