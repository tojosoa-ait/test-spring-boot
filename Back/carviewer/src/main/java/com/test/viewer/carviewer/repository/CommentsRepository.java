package com.test.viewer.carviewer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.test.viewer.carviewer.model.Comments;

@RestController
public interface CommentsRepository extends CrudRepository<Comments, Long>,CommentsRepositoryCustom{
	
}
