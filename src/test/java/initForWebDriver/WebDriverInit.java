package initForWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        ChromeOptions options = new ChromeOptions();
        //Отключает уведомления в браузере.
        options.addArguments("--disable-notifications");

        //Отключает блокировку всплывающих окон.
        options.addArguments("--disable-popup-blocking");

        //Отключает инфобары Chrome (например, "Chrome is being controlled by automated test software").
        options.addArguments("--disable-infobars");

        // Эта опция позволяет управлять некоторыми функциями, связанными с автоматизацией,
        // и ее использование может помочь предотвратить обнаружение автоматизированных средств веб-тестирования
        options.addArguments("--disable-blink-features=AutomationControlled");

        //Запускает браузер в режиме без графического интерфейса (headless mode).
       // options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
