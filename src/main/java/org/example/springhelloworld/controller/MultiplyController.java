package org.example.springhelloworld.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MultiplyController {

    @PostMapping("/api/multiply")
    public Map<String, Integer> multiply(@RequestBody Map<String, Integer> request) {
        int number = request.get("number");
        int multiplier = request.get("multiplier");
        int result = number * multiplier;
        return Map.of("result", result);
    }
}
