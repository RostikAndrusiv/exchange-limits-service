package com.rostik.andrusiv.microservices.limitsservice.controller;

import com.rostik.andrusiv.microservices.limitsservice.config.Configuration;
import com.rostik.andrusiv.microservices.limitsservice.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsConfigurations(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
