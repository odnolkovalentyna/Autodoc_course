package initForWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebDriverInit {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;



    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().browserVersion("119.0.6045.124").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
