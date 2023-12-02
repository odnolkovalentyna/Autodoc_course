package pattern.pageObject.selenium;
import org.openqa.selenium.WebDriver;


public class ProductPage extends ProductPageLocators{



    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleTest(){
        return driver.findElement(titleOnProductPage).getAttribute("innerText");
    }
}
