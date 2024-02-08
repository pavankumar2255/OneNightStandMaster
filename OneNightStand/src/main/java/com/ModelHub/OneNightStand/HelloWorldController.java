package com.ModelHub.OneNightStand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path= "/OneNightStand")
    public String helloWorld(){
        return " Welcome to OneNightStand App";
    }

}
