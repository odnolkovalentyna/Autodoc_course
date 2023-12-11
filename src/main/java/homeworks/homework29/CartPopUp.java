package homeworks.homework29;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPopUp extends CartPopUpLocators {


    public String getTitleOfProductInCart(){
        TITLE_OF_FIRST_PRODUCT_BASKET.shouldBe(Condition.visible,Duration.ofSeconds(15));
        return TITLE_OF_FIRST_PRODUCT_BASKET.getText();

    }
}
