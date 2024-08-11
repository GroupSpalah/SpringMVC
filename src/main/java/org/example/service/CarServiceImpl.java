package org.example.service;

import lombok.AllArgsConstructor;

import org.example.dao.CrudDAO;
import org.example.domain.Car;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CrudService {
    CrudDAO dao;

    @Override
    public void save(Car car) {
        dao.save(car);
    }

    @Override
    public Car findById(int id) {
        return dao.findById(id);
    }
}
