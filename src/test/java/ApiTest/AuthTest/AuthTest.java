package ApiTest.AuthTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthTest {

    private String token;

    private String GetAuthenticationToken(String AuthTokenEndPoint) {

        Response resp =
                given().contentType("application/json")
                        .post(AuthTokenEndPoint);
        JsonPath jsonPathEvaluator = resp.jsonPath();
        return token = jsonPathEvaluator.get("token");
    }

    @Test
    @Parameters({"AuthTokenEndPoint"})
    public void printResponse(String AuthTokenEndPoint) {
        System.out.println(GetAuthenticationToken(AuthTokenEndPoint));
    }

}
