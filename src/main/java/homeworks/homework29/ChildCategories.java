package homeworks.homework29;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class ChildCategories extends ChildCategoriesLocators {


    public String titleOfFirstProduct;


    public String getTitleOfFirstProduct() {
        TITLE_OF_FIRST_PRODUCT.shouldBe(Condition.visible, Duration.ofSeconds(5));
        titleOfFirstProduct = TITLE_OF_FIRST_PRODUCT.getText();
        return titleOfFirstProduct;
    }

    public ChildCategories addProductToCart() {
        BUTTON_TO_BUY.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return this;
    }


    public ChildCategories checkNumberOfProductsAddedToCart(int expectedCount) {
        ICON_BASKET.shouldBe(Condition.visible, Duration.ofSeconds(5));
        String count = ICON_BASKET.getText();
        Assert.assertEquals(count, Integer.toString(expectedCount), "Error in displaying the number of items added to the basket");
        return this;
    }

    public CartPopUp openCartPopUp() throws InterruptedException {
        ICON_BASKET.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(CartPopUp.class);
    }
}
