package com.iranavay.sytfad.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<?> index(){
        return ResponseEntity.ok("Welcome to our application");
    }
}
