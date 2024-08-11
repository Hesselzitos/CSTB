package com.CSTB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @GetMapping("/")
    public String Hello(){
        return "Hello from publisher!";
    }
}
