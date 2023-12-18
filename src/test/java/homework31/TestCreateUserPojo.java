package homework31;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;
import static org.hamcrest.Matchers.notNullValue;


public class TestCreateUserPojo {

    private final String BASE_URL = "https://reqres.in/";


    @Test
    public void testSuccessRegWithPojo() {
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(201));
        NewUser user = new NewUser("morpheus", "leader");
        CreateUser createUser = given()
                .when()
                .body(user)
                .post("api/users")
                .then().log().all()
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract().as(CreateUser.class);

        Assert.assertEquals(createUser.getName(), user.getName());
        Assert.assertEquals(createUser.getJob(), user.getJob());

        // Не знаю как проверить номер Id т.к. он каждый раз будет разным, додумалась только проверить что не null
        Assert.assertNotNull(createUser.getId());

        // по времени создания вижу только момент получить хотябы дату создания юзера и сверить что начало одинаковое
        String expectedCreatedAtPrefix = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Assert.assertTrue((createUser.getCreatedAt()).startsWith(expectedCreatedAtPrefix));
    }

}
