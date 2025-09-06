package com.codewave.test_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    public String work(){
        return "Working...";
    }

    @GetMapping
    public String test(){
        return "Testing";
    }
}
