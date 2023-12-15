package com.example.springsequrityjwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

    @GetMapping("/first")
    public ResponseEntity<String> first() {
        return ResponseEntity.ok("hello~~");
    }
}
