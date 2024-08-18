package org.example.repository;

import org.example.domain.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByNameAndAge(String name, int age);

    Car findByName(String name);

    @Query(value = "FROM Car c WHERE c.age = :p_age")
    List<Car> findAllByAge(@Param("p_age") int age);

    @EntityGraph(attributePaths = "owners")
    Car findById(int id);

    @Query("FROM Car c WHERE c.id IN (:p_ids)")
    @EntityGraph(attributePaths = "owners")
    List<Car> findAllByIdsIn(@Param("p_ids") List<Integer> ids);

    @EntityGraph(attributePaths = "owners")
    Page<Car> findAll(Pageable pageable);

}

/**
 * 20
 *
 *  4 pages by 5 ads
 *  2 pages by 10 ads
 */
