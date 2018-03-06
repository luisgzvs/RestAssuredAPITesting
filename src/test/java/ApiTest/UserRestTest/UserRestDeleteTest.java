package ApiTest.UserRestTest;

import ApiTest.Base.BaseRestTestMethods;
import org.testng.annotations.*;
import static io.restassured.RestAssured.given;

public class UserRestDeleteTest extends BaseRestTestMethods {

    @Test
    public void deleteUser() {
        int id = getLastId();
        given().pathParam("id", id)
                .when().delete("user/{id}")
                .then().statusCode(200);
    }

}
