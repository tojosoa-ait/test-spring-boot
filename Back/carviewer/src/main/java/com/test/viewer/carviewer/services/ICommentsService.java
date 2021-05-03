package com.test.viewer.carviewer.services;

import java.util.List;

import javax.persistence.EntityManager;

import com.test.viewer.carviewer.model.Comments;

public interface ICommentsService {
	List<Comments> findAll();
	List<Comments> findCommentsByIdCar(long id_car,EntityManager entityManager);
}
