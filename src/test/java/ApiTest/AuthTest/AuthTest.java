package ApiTest.AuthTest;

import Entities.AuthUser;
import Entities.User;
import org.testng.annotations.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AuthTest {

    //@Test
    //@Parameters({"AuthTokenEndPoint"})
    public String GetAuthenticationToken(String AuthTokenEndPoint) {
        AuthUser user = new AuthUser();
        user.setUsername("luisgzvs");
        user.setPassword("12345");
        String response;
        Response resp =
                given().header("Authorization", "Bearer "+ AuthTokenEndPoint)
                .post(AuthTokenEndPoint, user);
        return response = resp.toString();
    }

    @Test
    @Parameters({"AuthTokenEndPoint"})
    public void printResponse(String AuthTokenEndPoint){
        System.out.print(GetAuthenticationToken(AuthTokenEndPoint));
    }

    }
