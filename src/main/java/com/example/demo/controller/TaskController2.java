package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController2 {

    @RequestMapping(value="controller")
    public int controller()
    {
       return 4;
    }
}
