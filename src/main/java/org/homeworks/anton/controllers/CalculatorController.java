package org.homeworks.anton.controllers;


import org.example.domain.Car;
import org.homeworks.anton.domain.CalculatorA;
import org.homeworks.anton.service.CalculatorService;
import org.homeworks.anton.service.impl.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "calc")
public class CalculatorController {
CalculatorService service = new  CalculatorServiceImpl();

    @GetMapping(value = "/calculate")
    public void save() throws Exception {
        service.calcMethod(8,5,"*");
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody CalculatorA calculatorA) {
        System.out.println(calculatorA);
    }
}