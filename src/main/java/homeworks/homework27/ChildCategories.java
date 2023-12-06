package homeworks.homework27;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildCategories extends ChildCategoriesLocators{

    protected WebDriverWait webDriverWait;
    public String titleOfFirstProduct;


    public ChildCategories(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public String getTitleOfFirstProduct(){
        WebElement titleFromElement =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(TITLE_OF_FIRST_PRODUCT));
        titleOfFirstProduct = titleFromElement.getText();
        return titleOfFirstProduct;
    }

    public ChildCategories addProductToCart(){
        WebElement buttonAddToBasket =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(BUTTON_TO_BUY));
        buttonAddToBasket.click();
        return this;
    }


    public ChildCategories checkNumberOfProductsAddedToCart(int expectedCount){
        WebElement countOfGoodsInTheBasket =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(ICON_BASKET));
        String count = countOfGoodsInTheBasket.getText();
        Assert.assertEquals(count, Integer.toString(expectedCount),"Error in displaying the number of items added to the basket");
        return this;
    }

    public CartPopUp openCartPopUp() throws InterruptedException {
        WebElement countOfGoodsInTheBasket =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(ICON_BASKET));
        countOfGoodsInTheBasket.click();
        return new CartPopUp(webDriverWait);
    }
}
