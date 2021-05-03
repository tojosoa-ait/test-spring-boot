package com.test.viewer.carviewer.repository;

import org.springframework.data.repository.CrudRepository;
import com.test.viewer.carviewer.model.User;

public interface UserRepository extends CrudRepository<User, Long>,UserRepositoryCustom {
	
}
