package org.example.dao;

import org.example.domain.Car;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CrudDAO {
    void save(Car car);

    Car findById(int id);

    List<Car> findAllByAge(int age);

    List<Car> findAllByIdsIn(List<Integer> ids);
    List<Car> findAllPagination(int page, int count);

}
