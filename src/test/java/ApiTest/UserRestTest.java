package ApiTest;

import TestSetup.FunctionalTest;
import org.junit.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class UserRestTest extends FunctionalTest {

    @Test
    public void basicPingTest(){
        get("/lotto").then().body("lotto.lottoId", equalTo(5));
    }
}
