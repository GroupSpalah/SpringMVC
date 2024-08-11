package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.domain.Car;
import org.example.service.CrudService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

//@Controller
@RestController
@RequestMapping(value = "car")
@AllArgsConstructor
public class CarController {

    CrudService service;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public void show() {
        System.out.println("Hello");//localhost:9999/mvc/car/show
    }

    @GetMapping(value = "/show1")
    public void show1() {
        System.out.println("Hello");//localhost:9999/mvc/car/show
    }

    @GetMapping(value = "/exception")
    public void show3() throws IOException {
        throw new IOException("I'm IOException");
    }

    @PostMapping(value = "/show2")
    public void show2(@RequestBody Car car) {
        service.save(car);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Car car) {
        service.save(car);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Car car) {
        System.out.println(car);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        System.out.println(id);
    }

    @GetMapping(value = "/find/{id}")
//    @ResponseBody
    public Car findById(@PathVariable("id") int id) {
        Car car = service.findById(id);

        return car;
    }

}
