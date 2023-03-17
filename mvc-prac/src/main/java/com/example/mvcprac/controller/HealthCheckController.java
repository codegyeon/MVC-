package com.example.mvcprac.controller;

import com.example.mvcprac.annotation.Controller;
import com.example.mvcprac.annotation.RequestMethod;
import com.example.mvcprac.annotation.RequsetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HealthCheckController {
    @RequsetMapping(value = "/health", method = RequestMethod.GET)
    public String home(HttpServletRequest request , HttpServletResponse response){
        return "ok";
    }
}
