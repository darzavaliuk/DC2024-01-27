package com.example.lab1.model;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Creator {
    int id;
    @Size(min = 2, max = 64)
    String login;
    @Size(min = 8, max = 128)
    String password;
    @Size(min = 2, max = 64)
    String firstname;
    @Size(min = 2, max = 64)
    String lastname;
}
