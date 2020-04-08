package com.pluralsight.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String getGreeting(ModelMap modelMap){
        modelMap.put("message", "Hello Santiago");
        return "greeting";
    }
}
