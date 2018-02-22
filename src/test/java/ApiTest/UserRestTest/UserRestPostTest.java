package ApiTest.UserRestTest;

import ApiTest.Base.BaseRestTestMethods;
import Entities.User;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserRestPostTest extends BaseRestTestMethods {

    @Test
    public void aUserRegisterToTheBank() {

        int id = getLastId();
        User user = new User();
        user.setId(id);
        user.setName("Luis");
        user.setLastName("Gonzalez");
        user.setUsername("luisgzvs");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/the_purplebunny/128.jpg");
        user.setPassword("12345");

        given()
                .contentType("application/json")
                .body(user)
                .when().post("/user/")
                .then().statusCode(201);
    }

}
