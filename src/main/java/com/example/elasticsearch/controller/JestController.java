package com.example.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author daizhichao
 * @date 2019/11/14
 */
@RestController
@RequestMapping("/jest")
public class JestController {

    @GetMapping("/test")
    public void test() throws IOException {
        JestTest.test();
    }
}
