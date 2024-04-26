package org.example;


import org.example.config.ConfigAppProject;
import org.example.domain.Car;
import org.example.service.CarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestFinalProject {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAppProject.class);

        CarServiceImpl service = context.getBean(CarServiceImpl.class);

        Car car = Car.builder()
                .age(10)
                .name("BMW")
                .build();

        service.save(car);
    }
}
