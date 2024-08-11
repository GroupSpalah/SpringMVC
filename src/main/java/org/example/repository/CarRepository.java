package org.example.repository;

import org.example.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByNameAndAge(String name, int age);

    Car findByName(String name);
}
