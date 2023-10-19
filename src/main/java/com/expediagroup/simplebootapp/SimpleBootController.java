package com.expediagroup.simplebootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleBootController {


    @RequestMapping("/")
    String hello() {
        return "Hello!";
    }
    
    @RequestMapping("/ping")
    String ping() {
        return "Ping!";
    }

	
}
