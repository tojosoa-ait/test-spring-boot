package com.test.viewer.carviewer.services;

import java.util.List;
import javax.persistence.EntityManager;

import com.test.viewer.carviewer.model.User;

public interface IUserService {
	List<User> findAll();
	User getUserById(EntityManager entityManager, long user_id);
	User getConnectedUser(EntityManager entityManager, String login, String password);
}
