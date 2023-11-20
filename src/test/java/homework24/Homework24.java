package homework24;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework24  extends WebDriverInit {

    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By MAIN_CATEGORY = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class," +
            " 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]");
    private final By CHILD_CATEGORY = By.xpath("//span[text()=' Laptopy ']");
    private final By POPUP = By.xpath("//span[@class='exponea-close']");
    private final By ALL_GOODS = By.xpath("//span[@class='goods-tile__title']");
    private final By ALL_PRICES = By.xpath("//span[@class='goods-tile__price-value']");

    @Test
    public void findElements() throws InterruptedException, IOException {
        driver.get("https://rozetka.pl/");

        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement computers = webDriverWait.until(ExpectedConditions.elementToBeClickable(MAIN_CATEGORY));
        computers.click();
        WebElement laptops = webDriverWait.until(ExpectedConditions.elementToBeClickable(CHILD_CATEGORY));
        laptops.click();
        Thread.sleep(5000);

        List<WebElement> listOfTitle = driver.findElements(ALL_GOODS);
        List<WebElement> listOfPrices = driver.findElements(ALL_PRICES);

        Map<String, String> titleAndPriceMap = new HashMap<>();

        for (int i = 0; i < Math.min(listOfTitle.size(), listOfPrices.size()); i++) {
            String title = listOfTitle.get(i).getText().split(",")[0].trim();
            String priceText = listOfPrices.get(i).getText();

            // Extracting only the whole part of the price (before the comma) and removing non-numeric characters
            String price = priceText.split(",")[0].replaceAll("[^0-9]", "");

            titleAndPriceMap.put(title, price);
        }

        writeDataToFile(titleAndPriceMap);
    }

    // Метод для проверки наличия попапа и его закрытия
    private void closePopUp(By popupLocator) {
        try {
            WebElement popupElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(popupLocator));
            popupElement.click();
        } catch (TimeoutException e) {
            System.err.println("The expected popup did not appear");
        }
    }

    // Метод для записи данных в файл
    private void writeDataToFile(Map<String, String> dataMap) throws IOException {
        FileWriter writer = new FileWriter("rozetkaLaprops60.txt");
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }
        writer.close();
    }
}

