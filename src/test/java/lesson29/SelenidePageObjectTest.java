package lesson29;

import initForWebDriver.InitialSelenide;
import org.testng.annotations.Test;
import pattern.pageObject.selenide.MainPageLogic;

public class SelenidePageObjectTest extends InitialSelenide {

    @Test
    public void testSelenidePO(){
        new MainPageLogic().checkCategoriesQuantity(16)
                .clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .checkQuantityOfGoodsTitles(60);
    }
}
