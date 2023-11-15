package lesson24;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFindElements extends WebDriverInit {
    private final int QUANTITY_OF_GOODS = 60;
    private final By COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
    private final By MAIN_CATEGORY = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class, 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]");
    private final By CHILD_CATEGORY =  By.xpath("//span[text()=' Laptopy ']");
    private final By POPUP =  By.xpath("//span[@class='exponea-close']");
    private final By ALL_GOODS =  By.xpath("//span[@class='goods-tile__title']");


    @Test
    public void findElements() throws InterruptedException {
        driver.get("https://rozetka.pl/");

        // закрытие попапов
        closePopUp(COOKIES);
        closePopUp(POPUP);

        WebElement computers =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(MAIN_CATEGORY));
        computers.click();
        WebElement laptops =  webDriverWait.until(ExpectedConditions
                .elementToBeClickable(CHILD_CATEGORY));
        laptops.click();
        Thread.sleep(5000); //пришлось добавить (не нашла лучшего решения)

        List<WebElement> listOfTitle = driver.findElements(ALL_GOODS);

        for (WebElement element : listOfTitle){
            String titleText = element.getText();
            System.out.println(titleText);
        }
        Assert.assertEquals(listOfTitle.size(),QUANTITY_OF_GOODS,"No 60 elements");

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
}
