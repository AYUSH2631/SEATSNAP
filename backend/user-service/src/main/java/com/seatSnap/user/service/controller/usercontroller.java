package com.seatSnap.user.service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {

    @GetMapping("/status")
    public String status(){
        return "User service is running fine" ;
    }
}
