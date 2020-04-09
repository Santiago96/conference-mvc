package com.pluralsight.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String getGreeting(ModelMap modelMap) {
        modelMap.put("message", "Hello Santiago");
        return "greeting";
    }

    @GetMapping("thymeleaf")
    public String getThymeleafTemplate(ModelMap modelMap) {
        modelMap.put("message", "Hello Santiago using thymeleaf");
        return "thyme";
    }
}
