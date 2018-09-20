package com.erwin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanwen.liu on 2018/9/20.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
