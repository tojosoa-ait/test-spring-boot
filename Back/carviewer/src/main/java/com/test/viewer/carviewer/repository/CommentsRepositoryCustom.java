package com.test.viewer.carviewer.repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.test.viewer.carviewer.model.Comments;

public interface CommentsRepositoryCustom {
	List<Comments> findAll();
	List<Comments> findCommentsByIdCar(long id_car,EntityManager entityManager);
}
