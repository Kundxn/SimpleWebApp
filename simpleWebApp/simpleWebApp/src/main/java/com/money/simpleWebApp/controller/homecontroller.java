package com.money.simpleWebApp.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class homecontroller {


   @RequestMapping("/")
    public String greet(){
        return "welcome to java!!!";
    }
    @RequestMapping("/about")
    public String about(){
        return "this is a simple web app";
    }
}
