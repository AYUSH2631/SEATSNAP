package com.seatSnap.payment.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentcontroller {

    @GetMapping("/status")
    public String status(){
        return "payment service is running" ;
    }
}
