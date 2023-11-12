package homework22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Test {
    private WebDriver driver;
    private WebDriverWait webDriverWait;



    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().browserVersion("119.0.6045.124").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @org.testng.annotations.Test
    public void firstTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua");

        // Локаторы для логотипа
        By logoByCss = By.cssSelector("a.header__logo");
        By logoByXpath = By.xpath("//a[@class='header__logo']");


        // Локаторы для каталога
        By catalogByCss = By.id("fat-menu");
        By catalogByXpath = By.xpath("//rz-header-fat-menu[@class='header-catalog']");

        // Локатор для кнопки микрофона в инпуте поиска
        By searchMicrophoneByCss = By.cssSelector("button.search-form__microphone");
        By searchMicrophoneByXpath = By.xpath("//button[contains(@class, 'search-form__microphone')]");


        // Локатор для кнопки корзины
        By cartButtonByCss = By.cssSelector("li.header-actions__item--cart button.header__button");
        By cartButtonByXpath = By.xpath("//rz-cart/button[@class='header__button ng-star-inserted']");


        WebElement logoByCssElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(logoByCss));
        WebElement logoByXpathElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(logoByXpath));
        WebElement catalogByCssElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(catalogByCss));
        WebElement catalogByXpathElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(catalogByXpath));
        WebElement searchMicrophoneByCssElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(searchMicrophoneByCss));
        WebElement searchMicrophoneByXpathElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(searchMicrophoneByXpath));
        WebElement cartButtonByCssElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(cartButtonByCss));
        WebElement cartButtonByXpathElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(cartButtonByXpath));


    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
