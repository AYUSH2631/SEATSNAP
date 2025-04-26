package com.seatSnap.booking.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookingcontroller {

    @GetMapping("/status")
    public String status(){
        return "Booking service is running" ;
    }
}
