package homeworks.homework27;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainCategories extends MainCategoriesLocators{
    protected WebDriverWait webDriverWait;

    public MainCategories(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public ChildCategories chooseChildCategory() throws InterruptedException {
        WebElement laptopy =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(CHILD_CATEGORY));
        laptopy.click();

        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(CHILD_CATEGORY));

        return new ChildCategories(webDriverWait);
    }


}
