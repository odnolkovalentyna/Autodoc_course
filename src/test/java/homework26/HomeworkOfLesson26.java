package homework26;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class HomeworkOfLesson26 extends WebDriverInit {

    private By COOKIES;
    private By POPUP;
    private By MAIN_CATEGORY;
    private By CHILD_CATEGORY;
    private By All_CATEGORY;
    private By CHECKBOX_BRAND;
    private By MAX_PRICE;
    private By MAX_PRICE_BTN;
    private By PROMO_LABEL;
    private By PRODUCTS;
    private By TITLE_HP;
    private String PROMOCJA;

    private void initializeElements() {
        COOKIES = By.xpath("//button[@class='button button_size_large button_color_green']");
        POPUP = By.xpath("//span[@class='exponea-close']");
        MAIN_CATEGORY = By.xpath("//li[@class='menu-categories__item ng-star-inserted']/a[contains(@class," +
                " 'menu-categories__link') and contains(text(), 'Komputery i laptopy')]");
        CHILD_CATEGORY = By.xpath("//span[text()=' Laptopy ']");
        All_CATEGORY = By.xpath("//rz-widget-auto-portal");
        CHECKBOX_BRAND = By.xpath("//a[@data-id='HP']");
        MAX_PRICE = By.xpath("//fieldset/div/input[2]");
        MAX_PRICE_BTN = By.xpath("//fieldset/div/button");
        PROMO_LABEL = By.xpath("(//div[@class='simple-slider']//span)[2]");
        PRODUCTS = By.xpath("//div[@class='goods-tile__inner']");
        TITLE_HP = By.xpath("//h1[contains(text(), 'Laptopy HP')]");
        PROMOCJA = "PROMOCJA";
    }

    @Test
    public void testOfPromoLabel() throws InterruptedException {

        driver.get("https://rozetka.pl/");
        initializeElements();

        closePopUp(COOKIES);
        closePopUp(POPUP);

        // В сайд меню перейти в раздел Ноутбуки и компьютеры
        goToLaptopsCategory();

        // Выбрать бренд HP
        selectBrandHP();

        // Установить цену до 10000
        setMaxPrice();

        // Найти первый товар с PROMOCJA и зайти на его продуктовую
        clickOnPromotionProduct();

        // Проверить, что на продуктовой странице отображается плашка “PROMOCJA”
        checkPromotionLabel();
    }


    private void goToLaptopsCategory() {
        WebElement computers = webDriverWait.until(ExpectedConditions.elementToBeClickable(MAIN_CATEGORY));
        computers.click();
        WebElement laptops = webDriverWait.until(ExpectedConditions.elementToBeClickable(CHILD_CATEGORY));
        laptops.click();
        Assert.assertTrue(webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(All_CATEGORY)));
    }

    private void selectBrandHP() {
        WebElement checkboxOfBrand = webDriverWait.until(ExpectedConditions.elementToBeClickable(CHECKBOX_BRAND));
        checkboxOfBrand.click();
        WebElement title = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_HP));
        Assert.assertTrue(title.isEnabled());
    }

    private void setMaxPrice() {
        WebElement maxPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(MAX_PRICE));
        maxPrice.clear();
        maxPrice.sendKeys("10000");
        WebElement btnPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(MAX_PRICE_BTN));
        btnPrice.click();
    }

    private void clickOnPromotionProduct() {
        List<WebElement> listOfProduct = driver.findElements(PRODUCTS);
        for (WebElement product : listOfProduct) {
            if (product.getText().contains(PROMOCJA)) {
                product.click();
                break;
            }
        }
        Assert.assertTrue(webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(PRODUCTS)));
    }

    private void checkPromotionLabel() {
        WebElement promo = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(PROMO_LABEL));
        Assert.assertEquals(promo.getText(), PROMOCJA);
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





