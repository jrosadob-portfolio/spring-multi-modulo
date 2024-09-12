package com.math.services;

import org.springframework.stereotype.Service;

import com.math.entities.Operation;

@Service
public class MathService {
  public Operation sum(int a, int b) {
    int result = a + b;
    return new Operation(a, b, "sum", result);
  }
}
