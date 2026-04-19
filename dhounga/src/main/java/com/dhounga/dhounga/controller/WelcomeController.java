package com.dhounga.dhounga.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
public class WelcomeController {

    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("welcome", HttpStatus.OK);
    }
}
