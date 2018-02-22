package ApiTest.UserRestTest;

import TestSetup.SetupTest;
import org.junit.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class UserRestGetTest extends SetupTest {

    @Test
    public void basicUserTest() {
        given().when().get("/user/").then().statusCode(200);
    }

    @Test
    public void invalidUserId() {
        given().when().get("/user/999")
                .then().statusCode(404);
    }

    @Test
    public void verifyUserStructured() {
        given().when().get("/user").then()
                .body(containsString("username"));
    }

    @Test
    public void verifyNameStructured() {
        given().when().get("/user").then()
                .body("name",equalTo("Luis"));
    }

    @Test
    public void verifyUsersNamesOfUsers() {
        given().when().get("/user").then().
                body("id",equalTo(99));
    }

}
