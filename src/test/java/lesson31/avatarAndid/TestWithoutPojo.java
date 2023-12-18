package lesson31.avatarAndid;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class TestWithoutPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testAvatarAndIdWithoutPojo(){
        given()
                .when()
                .get(BASE_URL+ "api/users?page=2")
                .then().log().all();

    }

    @Test
    public void testAvatarAndIdWithoutPojo2(){
        Response response = given()
                .when()
                .get(BASE_URL+ "api/users?page=2")
                .then().log().all()
                .body("page", equalTo(2))
                .body("data.id", notNullValue())
                .body("data.email", notNullValue())
                .body("data.first_name", notNullValue())
                .body("data.last_name", notNullValue())
                .body("data.avatar", notNullValue())
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        List<Integer> ids = jsonPath.get("data.id");
        List<String> emails = jsonPath.get("data.email");
        List<String> avatars = jsonPath.get("data.avatar");

        Assert.assertTrue(emails.stream().allMatch(x->x.endsWith("@reqres.in")));

        for(int i = 0; i < ids.size(); i++){
            Assert.assertTrue(avatars.get(i).contains(ids.get(i).toString()));
        }
    }

}
