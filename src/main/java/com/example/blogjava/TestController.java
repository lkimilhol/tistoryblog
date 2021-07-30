package com.example.blogjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogjava.aop.Calculator;

@RestController
public class TestController {
    @GetMapping("/test")
    public void test() {
        Calculator calculator = new Calculator(10);
        calculator.add(10);
        System.out.println(calculator.get());
    }
}
