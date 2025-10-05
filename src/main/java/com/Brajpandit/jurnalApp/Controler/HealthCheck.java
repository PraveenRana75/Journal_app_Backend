package com.Brajpandit.jurnalApp.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health_chack")
    public String HealthCheck(){
        return "OK";
    }

}
