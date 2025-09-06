package com.codewave.test_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping("/works")
    public String work(){
        return "Working...";
    }

    @GetMapping("/tests")
    public String test(){
        return "Testing";
    }

    @GetMapping("/clones")
    public String clone(){
        return "Cloning...";
    }
}
