package com.test.viewer.carviewer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments  {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "comment")
	private String comment;
	@Column(name = "user_id")
	private Long user_id;
	 public Long getId_user() {
		return user_id;
	}
	public void setId_user(Long id_user) {
		this.user_id = id_user;
	}
	public Long getId_car() {
		return id_car;
	}
	public void setId_car(Long id_car) {
		this.id_car = id_car;
	}
	@Column(name = "id_car")
	 private Long id_car;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
