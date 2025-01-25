package com.money.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logincontroller {

    @RequestMapping("/login")
    public String login(){
        return "login page";
    }
}
