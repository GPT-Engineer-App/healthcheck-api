package com.example.healthcheck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/gpt-test")
public class HealthcheckController {

    @GetMapping("/healthcheck")
    public Map<String, String> healthcheck() {
        Map<String, String> response = new HashMap<>();
        response.put("result", "success");
        return response;
    }
}