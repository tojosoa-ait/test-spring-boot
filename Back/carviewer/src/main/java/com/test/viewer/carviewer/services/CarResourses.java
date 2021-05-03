package com.test.viewer.carviewer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.viewer.carviewer.repository.CarRepository;
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class CarResourses {
	    
	
	@Autowired
	private CarRepository repository;
	
	  
	  @GetMapping("cars/{username}/cars")
	    public List<com.test.viewer.carviewer.model.Car> findCars(Model model) {

	        List<com.test.viewer.carviewer.model.Car> cars = (List<com.test.viewer.carviewer.model.Car>) repository.findAll();
	        return cars;
	    }
	  
	  
}
