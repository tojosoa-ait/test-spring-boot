package com.test.viewer.carviewer.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.viewer.carviewer.model.Car;
import com.test.viewer.carviewer.model.Comments;
import com.test.viewer.carviewer.model.User;
import com.test.viewer.carviewer.repository.CarRepository;
import com.test.viewer.carviewer.repository.CommentsRepository;

@Service
public class CommentsService implements ICommentsService{

	@Autowired
    private CommentsRepository repository;
	
	@Override
    public List<Comments> findAll() {

		return (List<Comments>)repository.findAll();
    }

	@Override
	public List<Comments> findCommentsByIdCar(long id_car, EntityManager entityManager) {
		return (List<Comments>)repository.findCommentsByIdCar(id_car,entityManager);
	}
	
}
