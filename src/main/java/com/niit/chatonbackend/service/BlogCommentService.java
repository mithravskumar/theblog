package com.niit.chatonbackend.service;

import java.util.List;

import com.niit.chatonbackend.model.BlogComment;

public interface BlogCommentService {

	List<BlogComment> commentList();
	
	BlogComment getById(String blogId);

	List<BlogComment> getCommentById(String commentId);

	void saveComment(BlogComment blogComment);

	BlogComment updateComment(String commentId, BlogComment blogComment);

	void deleteComment(String CommentId);

}
