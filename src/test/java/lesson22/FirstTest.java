package lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    //1.Перейти на урл розетки
    //2 В инпут поиска ввести mac
    //3 Нажать кнопку найти
    //4 Использовать метод getText() для получения тайтла первого товара из выдачи
    //5

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    final String EXPECTED_TITLE = " Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray  ";

    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().browserVersion("119.0.6045.124").setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();

        WebElement titleOfFirstProduct = driver.findElement(By.xpath("(//span[@class='goods-tile__title'])[1]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(titleOfFirstProduct));
        String title = titleOfFirstProduct.getTagName();

        Assert.assertEquals(title, EXPECTED_TITLE, "Title doesn't contains searching data");

    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
