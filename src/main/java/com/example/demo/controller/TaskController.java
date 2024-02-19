package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class TaskController {
    @RequestMapping(value="/welcome1")
    public String welcome() {
        return "Welcome HEllo";
    }

    @RequestMapping(value="/welcome2")
    public String welcome2() {
        return "Welcome HEllo2222";
    }
}
