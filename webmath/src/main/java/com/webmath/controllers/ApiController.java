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

    // http://localhost:43047/api/sum?a=5&b=6
    @GetMapping("/sum")
    public Operation sum(@RequestParam int a, @RequestParam int b) {
        return mathService.sum(a, b);
    }

    // http://localhost:43047/api/suma
    @GetMapping("/suma1")
    public String suma() {
        return "This is the response for http://localhost:6701/api/suma1";
    }

    // http://localhost:43047/api/suma2
    @GetMapping("suma2")
    public String suma2() {
        return "This is the response for http://localhost:6701/api/suma2";
    }
}
