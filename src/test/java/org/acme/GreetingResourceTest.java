package org.acme;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(GreetingResource.class)
public class GreetingResourceTest {

    static TestData testData;
    static String testDataJson;

    @BeforeAll
    public static void init() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        testData = new TestData(23,12,48.5,124.4,"Sample Point",312.41);
        testDataJson = mapper.writeValueAsString(testData);
    }

    @Test
    public void testHelloEndpoint() {

        given()
          .when().get()
          .then()
                .statusCode(200)
                .body("$.size()", is(1),
                        "[0].id", is(23));


        given()
                .when().get()
                .then()
                .statusCode(200)
                .body("[0].age", is(12));
    }

}