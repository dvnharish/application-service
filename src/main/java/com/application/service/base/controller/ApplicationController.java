package com.application.service.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApplicationController {

    @GetMapping
    public String sayHelloJenkins(){

        return "Hello Jenkins !!!!";
    }


}
