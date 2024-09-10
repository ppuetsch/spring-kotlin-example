package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.HalfItService.halfItUsingKotlinService;

@RestController("/api")
class HalfItController {
    @GetMapping("/halfIt/{value}")
    public double halfIt(@PathVariable double value){
        return  value / 2.0;
    }

    @GetMapping("/halfItUsingJava/{value}")
    public double halfItUsingService(@PathVariable double value){
        return halfItUsingKotlinService(value);
    }

}

