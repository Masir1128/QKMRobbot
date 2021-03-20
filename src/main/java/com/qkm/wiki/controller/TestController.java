package com.qkm.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Masir Description:
 * IO:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "李群";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World ! Post." + name;
    }
}
