package org.example.dao;

import org.example.domain.Car;

public interface CrudDAO {
    void save(Car car);

    Car findById(int id);
}
