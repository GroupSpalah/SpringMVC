package org.homeworks.misha.controllers;

import org.homeworks.misha.domain.CalculatorM;
import org.homeworks.misha.service.CalculatorService;
import org.homeworks.misha.service.impl.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "calculator")
public class CalculatorController {
    CalculatorService service = new CalculatorServiceImpl();

    @GetMapping(value = "/calculate")
    public void save() throws Exception {
        service.calcMethod(5, 3, "+");
    }

    @GetMapping(value = "/find/{id}")
    public CalculatorM findById(@PathVariable("id") int id) {
        CalculatorM byId = service.findById(id);
        return byId;

    }

    @PostMapping(value = "/save")
    public void save(@RequestBody CalculatorM calculator) {
        System.out.println(calculator);
    }
}