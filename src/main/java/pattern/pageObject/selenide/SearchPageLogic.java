package pattern.pageObject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class SearchPageLogic extends SearchPageLocators{

    public SearchPageLogic checkQuantityOfGoodsTitles(int titleAmount){
        titleOfAllProducts
                .should(CollectionCondition.size(titleAmount), Duration.ofSeconds(5));
        return this;

    }
}
