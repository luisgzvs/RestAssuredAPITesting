package ApiTest.Base;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class BaseRestTestMethods {

    protected int getLastId() {
        ArrayList lastId = given()
                .when().get("/user").then()
                .body("empty", equalTo(false))
                .extract().path("id");
        return lastId.size();
    }

    public void invalidUserId(int id) {
        given().pathParam("id", id)
                .when().get("/user/{id}")
                .then().statusCode(404);
    }


}
