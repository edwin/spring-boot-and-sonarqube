package com.edw.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasToString;

/**
 * <pre>
 *     com.edw.controller.IndexControllerTest
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Mei 2024 20:47
 */
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("01. Testing Index Page")
public class IndexControllerTest {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = this.port;
    }

    @Test
    @DisplayName("01. Test Index Page should give 200")
    public void test_indexPageShouldGive_200() {
        given()
                .log().all()
                .when().get("/")
                .then()
                .statusCode(200)
                .body("hello", hasToString("world"))
                .log().all();
    }


    @Test
    @DisplayName("02. Test Random Page should give 404")
    public void test_randomPageShouldGive_404() {
        given()
                .log().all()
                .when().get("/some-random-page")
                .then()
                .statusCode(404)
                .log().all();
    }

}
