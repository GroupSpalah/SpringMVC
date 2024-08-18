package org.example.service;

import lombok.AllArgsConstructor;

import org.example.dao.CrudDAO;
import org.example.domain.Car;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Car> findAllByAge(int age) {
        return dao.findAllByAge(age);
    }

    @Override
    public List<Car> findAllByIdsIn(List<Integer> ids) {
        return dao.findAllByIdsIn(ids);
    }

    @Override
    public List<Car> findAllPagination(int page, int count) {
        return dao.findAllPagination(page, count);
    }
}
