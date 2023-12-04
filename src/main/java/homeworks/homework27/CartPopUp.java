package homeworks.homework27;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPopUp extends CartPopUpLocators {
    protected WebDriverWait webDriverWait;

    public CartPopUp(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public String getTitleOfProductInCart(){
        WebElement titleOfElementInTheBasket =  webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(TITLE_OF_FIRST_PRODUCT_BASKET));
        return titleOfElementInTheBasket.getText();

    }
}
