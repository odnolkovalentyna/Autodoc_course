package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGetCssValue extends WebDriverInit {

    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/apple_macbook_air_13_m1_256gb_2020_space_gray/p245161909/");
//        WebElement searchInput = driver.findElement(By.name("search"));
//        searchInput.sendKeys("Mac");
//        WebElement btnSearch = driver.findElement(
//                By.xpath("//button[contains(@class, 'search-form__submit')]"));
//        btnSearch.click();
//        WebElement titleOfFirstProduct = driver.findElement(
//                By.xpath("(//span[@class='goods-tile__title'])[1]"));
//
//        webDriverWait.until(ExpectedConditions.visibilityOf(titleOfFirstProduct));
//        titleOfFirstProduct.click();
//        WebElement titleOnProductPage = driver.findElement(
//                By.xpath("//div[@class='product__heading-wrapper']"));

        WebElement inStockLabel = driver.findElement(
                By.xpath("//p[contains(@class,'status-label--green')]"));
        String colorOfInStockLabel = inStockLabel.getCssValue("color");
        Assert.assertEquals(colorOfInStockLabel,EXPECTED_LABEL_COLOR);
    }
}
