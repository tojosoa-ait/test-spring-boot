package com.test.viewer.carviewer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.test.viewer.carviewer.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long>{

}
