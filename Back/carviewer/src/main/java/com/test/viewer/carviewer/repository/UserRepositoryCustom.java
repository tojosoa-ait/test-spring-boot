package com.test.viewer.carviewer.repository;

import javax.persistence.EntityManager;
import com.test.viewer.carviewer.model.User;

public interface UserRepositoryCustom {
	User getUserById(EntityManager entityManager,long user_id);
	User getConnectedUser(EntityManager entityManager,String login,String password);

}
