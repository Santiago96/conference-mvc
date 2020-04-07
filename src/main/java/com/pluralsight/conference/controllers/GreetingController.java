package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String getGreeting(ModelMap modelMap, @RequestParam String message){
        modelMap.put("message", message);
        return "greeting";
    }

    @GetMapping("greeting")
    public String getGreeting(ModelMap modelMap){
        modelMap.put("message", "Santiago");
        return "greeting";
    }
}
