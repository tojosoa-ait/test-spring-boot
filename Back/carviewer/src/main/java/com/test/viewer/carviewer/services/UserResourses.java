package com.test.viewer.carviewer.services;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.test.viewer.carviewer.repository.UserRepository;
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserResourses {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private UserRepository repository;
	  
	  @GetMapping("users/{username}/myallusers")
	    public List<com.test.viewer.carviewer.model.User> findUsers(Model model) {

	        List<com.test.viewer.carviewer.model.User> users = (List<com.test.viewer.carviewer.model.User>) repository.findAll();
	        return users;
	    }
	  
	  @RequestMapping(value = "users/{username}/users/{user_id}", method = RequestMethod.GET)
	    public com.test.viewer.carviewer.model.User getUserById(Model model,@PathVariable("user_id") long user_id) {

	        com.test.viewer.carviewer.model.User user = (com.test.viewer.carviewer.model.User) repository.getUserById(entityManager,user_id);
	        return user;
	    }
	  
	  @RequestMapping(value = "users/{username}/users/{login}/{password}", method = RequestMethod.GET)
	    public com.test.viewer.carviewer.model.User getUserById(Model model,@PathVariable("login") String login,@PathVariable("password") String password) {

	        com.test.viewer.carviewer.model.User user = (com.test.viewer.carviewer.model.User) repository.getConnectedUser(entityManager, login, password);
	        return user;
	    }
}
