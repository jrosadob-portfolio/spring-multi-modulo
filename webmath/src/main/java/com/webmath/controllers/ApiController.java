package com.webmath.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.math.entities.Operation;
import com.math.services.MathService;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final MathService mathService;

    // Inyección de dependencias a través del constructor
    public ApiController(MathService mathService) {
        this.mathService = mathService;
    }

    // Endpoint que usa MathService de libreria1
    @GetMapping("/sum")
    public Operation sum(@RequestParam int a, @RequestParam int b) {
        return mathService.sum(a, b);
    }

}
