package com.nilesh.devops.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
                "application", "order-service",
                "version", "1.0"
        );
    }
}
