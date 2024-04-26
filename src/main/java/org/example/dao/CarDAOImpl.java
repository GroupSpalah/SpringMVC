package org.example.dao;

import org.example.domain.Car;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CarDAOImpl implements CrudDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public void save(Car car) {
        em.persist(car);
    }
}
