package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestWithDisplayedAndWriting extends WebDriverInit {
    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() throws IOException {
        driver.get("https://rozetka.com.ua/apple_macbook_air_13_m1_256gb_2020_space_gray/p245161909/");

        WebElement titleOnProductPage = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='product__heading-wrapper']")));

        WebElement inStockLabel = driver.findElement(
                By.xpath("//p[contains(@class,'status-label--green')]"));
        String colorOfInStockLabel = inStockLabel.getCssValue("color");
        Assert.assertEquals(colorOfInStockLabel,EXPECTED_LABEL_COLOR);
        WebElement price = driver.findElement(
                By.xpath("//p[@class='product-price__big']"));
        if (inStockLabel.isSelected() && colorOfInStockLabel.equals(EXPECTED_LABEL_COLOR)){
            FileWriter fileWriter = new FileWriter("Lesson23.txt");
            fileWriter.write(titleOnProductPage.getText() + " " + price.getAttribute("innerText"));
            fileWriter.close();
        }
    }
}
