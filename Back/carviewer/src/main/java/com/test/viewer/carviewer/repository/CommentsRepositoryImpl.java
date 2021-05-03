package com.test.viewer.carviewer.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.viewer.carviewer.model.Comments;

public class CommentsRepositoryImpl implements CommentsRepositoryCustom{

	@Autowired
    private CommentsRepository repository;
	@Override
	public List<Comments> findAll() {
		// TODO Auto-generated method stub
		return (List<Comments>) repository.findAll();
	}

	@Override
	public List<Comments> findCommentsByIdCar(long id_car, EntityManager entityManager) {
		// TODO Auto-generated method stub
		String queryStr = "select c from Comments c inner join Car ca on c.id_car = ca.id_car where ca.id_car = ?1";
		return (List<Comments>)entityManager.createQuery(queryStr,Comments.class).setParameter(1, id_car).getResultList();
	}

}
