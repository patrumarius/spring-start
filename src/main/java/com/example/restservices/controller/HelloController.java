package com.example.restservices.controller;

import com.example.restservices.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/france2")
    public Country france() {
        Country france = Country.of("France", 67);

        return france;
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);

        return List.of(c1, c2);
    }

    @GetMapping("/france")
    public ResponseEntity<Country> franceEntity() {
        Country c1 = Country.of("France", 67);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .body(c1);
    }



}
