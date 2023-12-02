package pattern.factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {

    @FindBy(xpath = "//div[@class='product__heading-wrapper']")
    WebElement titleOnProductPage;

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitleTest(){
        return titleOnProductPage.getAttribute("innerText");
    }
}
