package com.pluralsight.conference.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registration {


    private long id;

    @NotEmpty(message = "Nombre no puede estar vacio")
    private String name;
}
