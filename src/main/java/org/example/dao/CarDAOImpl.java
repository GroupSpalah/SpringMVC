package org.example.dao;

import lombok.AllArgsConstructor;
import org.example.domain.Car;
import org.example.repository.CarRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


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

        Car car = repository.findById(id).get();
        return car;
    }
}
