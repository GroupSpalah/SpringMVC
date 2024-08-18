package org.example.service;

import org.example.domain.Car;

import java.util.List;

public interface CrudService {
    void save(Car car);

    Car findById(int id);

    List<Car> findAllByAge(int age);

    List<Car> findAllByIdsIn(List<Integer> ids);

    List<Car> findAllPagination(int page, int count);

}
