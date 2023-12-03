package homework27;

import homeworks.homework27.ChildCategories;
import homeworks.homework27.MainPage;
import initForWebDriver.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestOfTitleProductInBasket extends WebDriverInit {

    final String URL = "https://rozetka.pl/";

    @Test
    public void firstTest() throws InterruptedException {
        driver.get(URL);

        String expectedTitle = new MainPage(webDriverWait)
                .closePopUpCookies()
                .closeAdPopup()
                .chooseMainCategory()
                .chooseChildCategory()
                .getTitleOfFirstProduct();


        String actualTitle = new ChildCategories(webDriverWait)
                .addProductToCart()
                .checkNumberOfProductsAddedToCart()
                .openCartPopUp()
                .getTitleOfProductInCart();


        Assert.assertEquals(actualTitle, expectedTitle, "The name of the product differs");

    }
}
