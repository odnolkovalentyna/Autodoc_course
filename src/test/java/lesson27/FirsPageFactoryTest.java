package lesson27;

import initForWebDriver.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.factory.MainPage;


public class FirsPageFactoryTest extends WebDriverInit {
    final String EXPECTED_TITLE =" Satynowa szminka Mac Satin Lipstick Faux 3g (773602048366) ";
    final String URL ="https://rozetka.pl/";


    @Test
    public void firstTest() {
        driver.get(URL);
        String actualTitle = new MainPage(driver)
                .typeTextInInputSearch("Mac")
                .clickBtnSearch()
                .clickOnProductTitleByIndex(0)
                .getTitleTest();

        Assert.assertEquals(actualTitle,EXPECTED_TITLE,"Title doesn't equals");
    }
}
