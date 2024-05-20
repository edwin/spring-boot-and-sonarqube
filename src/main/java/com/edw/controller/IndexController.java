package com.edw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 20 Mei 2024 16:44
 */
@RestController
public class IndexController {

    private static final String PASSWORD = "SOME_RANDOM_PASSWORD";

    @GetMapping("/")
    public Map helloWorld() {
        return new HashMap() {{
            put("hello", "world");
            put("your password is ", PASSWORD);
        }};
    }

}
