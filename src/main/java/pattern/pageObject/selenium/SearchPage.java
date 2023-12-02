package pattern.pageObject.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class SearchPage extends SearchPageLocators{

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickOnProductTitleByIndex(int titleIndex){
        List<WebElement> titles = driver.findElements(titleOfFirstProduct);
        titles.get(titleIndex).click();
        return new ProductPage(driver);
    }
}
