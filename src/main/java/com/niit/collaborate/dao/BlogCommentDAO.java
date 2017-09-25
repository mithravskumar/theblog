package com.niit.collaborate.dao;
import java.util.List;

import com.niit.collaborate.model.BlogComment;

public interface BlogCommentDAO {

	List<BlogComment> commentList();
	
	BlogComment getById(String blogId);

	List<BlogComment> getCommentById(String blogId);

	void saveComment(BlogComment blogComment);

	BlogComment updateComment(String commentId, BlogComment blogComment);

	void deleteComment(String CommentId);
}

