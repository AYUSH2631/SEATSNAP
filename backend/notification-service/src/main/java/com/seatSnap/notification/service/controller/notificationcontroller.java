package com.seatSnap.notification.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class notificationcontroller {

    @GetMapping("/status")
    public String status(){
        return "Notification service is running" ;
    }
}
