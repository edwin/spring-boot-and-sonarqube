package com.edw.controller;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    private BasicTextEncryptor encryptor = new BasicTextEncryptor();

    @GetMapping("/")
    public Map helloWorld() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }

    @GetMapping("/test")
    public Map testEncrypt(@RequestParam final String text) {
        encryptor.setPassword(PASSWORD);
        return new HashMap() {{
            put("encrypted", encryptor.encrypt(text));
        }};
    }

}
