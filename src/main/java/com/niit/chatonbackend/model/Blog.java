package com.niit.chatonbackend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "blog")
@Component
public class Blog extends BaseDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String blogId;
	private String title;
	private String description;
	private String userId;
	private String blogCreatedDate;
	private String status;
	private String reason;
	private int likes;
	private int dislikes;

	public int getLikes() {
		return likes;
	}
}

