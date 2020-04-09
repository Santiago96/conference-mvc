package com.pluralsight.conference.controllers;

import com.pluralsight.conference.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping(value = "user",
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Camila") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Varon") String lastName,
                        @RequestParam(value = "age", defaultValue = "23") int age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }
}
