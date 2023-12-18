package lesson31.avatarAndid;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

import static io.restassured.RestAssured.*;
import static lesson31.Specification.*;


public class TestWithPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testAvatarAndIdWithPojo(){

        List<UserData> userDataList = given()
                .when()
                .contentType(ContentType.JSON)
                .get(BASE_URL+ "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        System.out.println(userDataList.size());
        System.out.println(userDataList.get(0).getEmail());
        System.out.println(userDataList.get(0).getFirst_name());

    }

    @Test
    public void testAvatarAndIdWithPojoStream(){

        List<UserData> userDataList = given()
                .when()
                .contentType(ContentType.JSON)
                .get(BASE_URL+ "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        userDataList.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(userDataList.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

    }

    @Test
    public void testAvatarAndWithPojoSpecification(){
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(200));
        List<UserData> userDataList = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data",UserData.class);
        userDataList.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(userDataList.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

    }


}
