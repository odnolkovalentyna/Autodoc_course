package pattern.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends MainPageLocators{


    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage typeTextInInputSearch(String text){
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }
    public MainPage clearOfInputSearch(String text){
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch(){
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);
    }

}
