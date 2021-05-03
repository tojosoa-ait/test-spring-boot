package com.test.viewer.carviewer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.viewer.carviewer.model.Car;
import com.test.viewer.carviewer.repository.CarRepository;

@Service
public class CarService implements ICarService{
	
	@Autowired
    private CarRepository repository;
	
	@Override
    public List<Car> findAll() {

        return (List<Car>) repository.findAll();
    }
	
	
}
