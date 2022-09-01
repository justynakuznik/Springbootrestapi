package com.aplikacja.springbootrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEndpoint {

    //Adnotacja do definiowania endpointa
    @GetMapping("/user")
    public String getUser(){
        return "Justyna";
    }
}
