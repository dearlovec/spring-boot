package com.hww.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Author nothingToSay
 * @Date 2018/11/20 15:21
 **/
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "helloWorld";
    }
}
