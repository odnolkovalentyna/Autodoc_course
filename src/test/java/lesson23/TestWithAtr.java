package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestWithAtr extends WebDriverInit {

    final String EXPECTED_TITLE =" Satynowa szminka Mac Satin Lipstick Faux 3g (773602048366) ";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.pl/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();
        WebElement titleOfFirstProduct = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='goods-tile__title'])[1]")));
        webDriverWait.until(ExpectedConditions.visibilityOf(titleOfFirstProduct));
        titleOfFirstProduct.click();
        WebElement titleOnProductPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='product__heading-wrapper']")));
        String titleOnProductPageText = titleOnProductPage.getAttribute("innerText");

        Assert.assertEquals(titleOnProductPageText,EXPECTED_TITLE,"Title doesn't equals");

    }

}
