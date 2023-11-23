package lesson26;

import initForWebDriver.WebDriverInit;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestStatusCodeExample extends WebDriverInit {

    final String BASE_URL = "https://the-internet.herokuapp.com/status_codes/200";
    final int EXPECTED_STATUS_CODE = 200;

    @org.testng.annotations.Test
    public void testStatus() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(BASE_URL).openConnection();
        httpURLConnection.connect();

        int statusCode = httpURLConnection.getResponseCode();
        Assert.assertEquals(statusCode, EXPECTED_STATUS_CODE);
    }
}

