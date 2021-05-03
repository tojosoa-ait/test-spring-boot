package com.test.viewer.carviewer.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.test.viewer.carviewer.model.User;

public class UserRepositoryImpl implements UserRepositoryCustom{
	
	@Override
	public User getUserById(EntityManager entityManager,long user_id) {

        String queryStr = "select user_id,name,login,password from user where user_id = ?1";
        try {
            Query query = entityManager.createNativeQuery(queryStr,User.class);
            query.setParameter(1, user_id);
            User result = (User) query.getSingleResult();
            return   result;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

	@Override
	public User getConnectedUser(EntityManager entityManager, String login, String password) {
		// TODO Auto-generated method stub
		String queryStr = "select user_id,name,login,password from user where login = ?1 and password = ?2";
        try {
            Query query = entityManager.createNativeQuery(queryStr,User.class);
            query.setParameter(1, login);
            query.setParameter(2, password);
            User result = (User) query.getSingleResult();
            return   result;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
	}

}
