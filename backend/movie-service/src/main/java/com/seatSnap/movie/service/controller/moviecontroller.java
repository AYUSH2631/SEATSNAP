package com.seatSnap.movie.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class moviecontroller {

    @GetMapping("/status")
    public String status(){
        return "Movie service is running" ;
    }
}
