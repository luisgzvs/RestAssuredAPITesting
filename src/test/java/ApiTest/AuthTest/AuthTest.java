package ApiTest.AuthTest;

import org.testng.annotations.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthTest {

    @Test
    @Parameters({"AuthTokenEndPoint"})
    public void GetAuthenticationToken(String token) {

        Response resp =
                given().header("Authorization", "Bearer "+token)
                        .body("html.body", equalTo("works=true"));
    }

    }
