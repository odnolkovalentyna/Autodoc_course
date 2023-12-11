package homeworks.homework29;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainCategories extends MainCategoriesLocators {

    public ChildCategories chooseChildCategory() {
        CHILD_CATEGORY.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        CHILD_CATEGORY.shouldNotBe(Condition.visible,Duration.ofSeconds(5));
        return page(ChildCategories.class);
    }


}
