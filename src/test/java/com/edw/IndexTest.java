package com.edw;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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
@DisplayName("00. Sanity Check")
public class IndexTest {

    @Test
    @DisplayName("01. Test Hello World")
    public void helloWorld() {
        Assertions.assertTrue(Boolean.TRUE);
    }
}
