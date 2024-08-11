package org.example.service;

import org.example.domain.Car;

public interface CrudService {
    void save(Car car);

    Car findById(int id);
}
