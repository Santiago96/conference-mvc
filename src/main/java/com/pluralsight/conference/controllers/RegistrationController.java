package com.pluralsight.conference.controllers;


import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {


    @GetMapping("registration")
    public String showRegistration(@ModelAttribute("registration") Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult bindingResult, ModelMap modelMap){

        if(bindingResult.hasErrors()) {
            modelMap.put("error", "Some errors in the information");
            return "registration";
        }

        System.out.println("Name: " + registration.getName());
        System.out.println("ID: " + registration.getId());
        return "registration";
    }
}
