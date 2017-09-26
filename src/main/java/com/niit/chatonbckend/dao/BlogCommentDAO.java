package com.niit.chatonbckend.dao;

import java.util.List;

import com.niit.chatonbackend.model.BlogComment;

public interface BlogCommentDAO {

	List<BlogComment> commentList();
	
	BlogComment getById(String blogId);

	List<BlogComment> getCommentById(String blogId);

	void saveComment(BlogComment blogComment);

	BlogComment updateComment(String commentId, BlogComment blogComment);

	void deleteComment(String CommentId);
}
