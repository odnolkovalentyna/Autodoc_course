package lesson22.waites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitlyWaitExample {

    private WebDriver driver;

    @BeforeTest
    public void initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //ожидание в DOM любого єлемента 10 сек
    }


    @Test
    public void testWithImplicitWaite(){
        driver.get("https://www.google.com.ua");
        driver.findElement(By.xpath("someElement")).click();
    }

}
