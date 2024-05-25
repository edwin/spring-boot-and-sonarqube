package com.edw;


import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

/**
 * <pre>
 *     com.edw.IndexTest
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 20 Mei 2024 16:48
 */
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexTest {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = this.port;
    }

    @Test
    public void helloWorld() {
        Assertions.assertTrue(Boolean.TRUE);
    }

    @Test
    public void test_indexPageShouldGive_200() {
        given()
                .log().all()
                .when().get("/")
                .then()
                .statusCode(200)
                .body("hello", hasToString("world"))
                .log().all();
    }

}
