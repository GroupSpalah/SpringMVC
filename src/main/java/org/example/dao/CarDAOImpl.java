package org.example.dao;

import lombok.AllArgsConstructor;
import org.example.domain.Car;
import org.example.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@AllArgsConstructor
public class CarDAOImpl implements CrudDAO {

 /*   @PersistenceContext
    EntityManager em;*/

    CarRepository repository;

    @Override
    public void save(Car car) {
//        em.persist(car);
        repository.save(car);
    }

    @Override
    public Car findById(int id) {

        Car car = repository.findById(id);
        return car;
    }

    @Override
    public List<Car> findAllByAge(int age) {
        return repository.findAllByAge(age);
    }

    @Override
    public List<Car> findAllByIdsIn(List<Integer> ids) {
        return repository.findAllByIdsIn(ids);
    }

    @Override
    public List<Car> findAllPagination(int page, int count) {

        Pageable request = PageRequest.of(page, count);

        Page<Car> cars = repository.findAll(request);

        return cars.getContent();
    }
}
