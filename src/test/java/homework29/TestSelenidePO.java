package homework29;


import homeworks.homework29.ChildCategories;
import homeworks.homework29.MainPage;
import initForWebDriver.InitialSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSelenidePO extends InitialSelenide{

    final String URL = "https://rozetka.pl/";
    int countOfProduct = 1;

    @Test
    public void testPageObjectSelenide() throws InterruptedException {

        open(URL);

        String expectedTitle = new MainPage()
                .closePopUpCookies()
                .closeAdPopup()
                .chooseMainCategory()
                .chooseChildCategory()
                .getTitleOfFirstProduct();


        String actualTitle = new ChildCategories()
                .addProductToCart()
                .checkNumberOfProductsAddedToCart(countOfProduct)
                .openCartPopUp()
                .getTitleOfProductInCart();


        Assert.assertEquals(actualTitle, expectedTitle, "The name of the product differs");

    }

}
