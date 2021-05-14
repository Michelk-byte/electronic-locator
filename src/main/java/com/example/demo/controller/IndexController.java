package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{
    private final static String PATH = "/error";

    @Override
    @RequestMapping(PATH)
    public String getErrorPath() {
        return "No Mapping Found";
    }
}