package lesson31;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;

public class Specification {

    public static RequestSpecification requestSpecification(String baseUrl) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecification(int code){
        return new ResponseSpecBuilder()
                .expectStatusCode(code)
                .build();
    }
    public static void installSpec(RequestSpecification requestSpecification, ResponseSpecification responseSpecification){
        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;
    }
}
