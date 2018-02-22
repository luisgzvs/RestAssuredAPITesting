package ApiTest.Base;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class BaseRestTestMethods {

    public int getLastId() {
        ArrayList lastId = given()
                .when().get("/user").then()
                .body("empty", equalTo(false))
                .extract().path("id");
        return lastId.size();
    }
}
