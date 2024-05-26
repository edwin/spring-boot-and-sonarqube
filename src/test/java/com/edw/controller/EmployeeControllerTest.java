package com.edw.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasToString;

/**
 * <pre>
 *     com.edw.controller.EmployeeControllerTest
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 26 Mei 2024 20:46
 */
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("02. Testing Employee API")
public class EmployeeControllerTest {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = this.port;
    }

    @Test
    @DisplayName("01. Test Get Employee Page should give 200")
    public void test_indexPageShouldGive_200() {
        given()
                .log().all()
                .when().get("/employee/1")
                .then()
                .statusCode(200)
                .log().all();
    }


    @Test
    @DisplayName("02. Test Create Employee Page should give 200")
    public void test_createEmployeePageShouldGive_200() {
        given()
                .log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"employeeName\":\"dodol\"}")
                .when().post("/employee/")
                .then()
                .statusCode(200)
                .body("employeeName", hasToString("dodol"))
                .log().all();
    }
}
