package org.example.controllers;

import org.example.domain.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "car")
public class CarController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public void show() {
        System.out.println("Hello");//localhost:9999/mvc/car/show
    }

    @GetMapping(value = "/show1")
    public void show1() {
        System.out.println("Hello");//localhost:9999/mvc/car/show
    }
    
    @PostMapping(value = "/save")
    public void save(@RequestBody Car car) {
        System.out.println(car);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Car car) {
        System.out.println(car);
    }

    @DeleteMapping(value = "/delete{id}")
    public void delete(@PathVariable("id") int id) {
        System.out.println(id);
    }

    @GetMapping(value = "/find/{id}")
    @ResponseBody
    public Car findById(@PathVariable("id") int id) {
        Car mercedes = Car
                .builder()
                .id(id)
                .age(12)
                .name("Mercedes")
                .build();

        return mercedes;
    }
}
