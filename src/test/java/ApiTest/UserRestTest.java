package ApiTest;

import TestSetup.FunctionalTest;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class UserRestTest extends FunctionalTest{

    @Test
    public void basicPingTest() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

}
