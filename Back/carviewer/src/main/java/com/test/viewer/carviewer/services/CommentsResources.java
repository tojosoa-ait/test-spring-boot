package com.test.viewer.carviewer.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.viewer.carviewer.model.Comments;
import com.test.viewer.carviewer.repository.CommentsRepository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class CommentsResources {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private CommentsRepository repository;
	
	@GetMapping("comments/{username}/comments")
	 public List<com.test.viewer.carviewer.model.Comments> findComments(Model model) {
			List<com.test.viewer.carviewer.model.Comments> comments = (List<com.test.viewer.carviewer.model.Comments>)repository.findAll();
	        return comments;
	 }
	
	@GetMapping("comments/{username}/comments/{id_car}")
	 public List<com.test.viewer.carviewer.model.Comments> findCommentsCar(Model model,@PathVariable("id_car") long id_car) {
			List<com.test.viewer.carviewer.model.Comments> comments = (List<com.test.viewer.carviewer.model.Comments>)repository.findCommentsByIdCar(id_car,entityManager);
	        return comments;
	 }

}
