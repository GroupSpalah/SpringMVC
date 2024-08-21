package org.example;


import org.example.config.ConfigAppProject;
import org.example.domain.Car;
import org.example.domain.Owner;
import org.example.service.CarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestFinalProject {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAppProject.class);

        CarServiceImpl service = context.getBean(CarServiceImpl.class);

        Owner john = Owner
                .builder()
                .name("Ben")
                .build();

        Owner jack = Owner
                .builder()
                .name("Tom")
                .build();

        Car car = Car.builder()
                .age(10)
                .name("LAZ")
                .owners(List.of(jack, john))
                .build();

//        service.save(car);

        /*List<Car> cars = service.findAllByAge(32);

        System.out.println(cars);*/

//        Car car1 = service.findById(3);

//        System.out.println(car1);

//        List<Car> all = service.findAllByIdsIn(List.of(1, 2, 3));

//        System.out.println(all);

        List<Car> cars = service.findAllPagination(0, 3);

        System.out.println(cars);
    }
}
