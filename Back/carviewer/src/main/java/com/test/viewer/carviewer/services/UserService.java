package com.test.viewer.carviewer.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
//import javax.persistence.EntityManager;
import com.test.viewer.carviewer.model.User;
import com.test.viewer.carviewer.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository repository;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		
		return (List<User>) repository.findAll();
	}
	@Override
	public User getUserById(EntityManager entityManager, long user_id) {
		// TODO Auto-generated method stub
		return (User)repository.getUserById(entityManager, user_id);
	}
	
	@Override
	public User getConnectedUser(EntityManager entityManager, String login, String password) {
		// TODO Auto-generated method stub
		return (User)repository.getConnectedUser(entityManager, login, password);
	}

}
