package com.niit.chatonbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.chatonbckend.dao.BlogCommentDAO;
import com.niit.chatonbackend.model.BlogComment;

@Service
public class BlogCommentServiceImpl implements BlogCommentService {

	@Autowired
	private BlogCommentDAO blogCommentDao;
	
	
	public List<BlogComment> commentList() {
		// TODO Auto-generated method stub
		return blogCommentDao.commentList();
	}

	public List<BlogComment> getCommentById(String commentId) {
		// TODO Auto-generated method stub
		return blogCommentDao.getCommentById(commentId);
	}

	public void saveComment(BlogComment blogComment) {
		// TODO Auto-generated method stub
		blogCommentDao.saveComment(blogComment);
	}

	public BlogComment updateComment(String commentId, BlogComment blogComment) {
		// TODO Auto-generated method stub
		return blogCommentDao.updateComment(commentId, blogComment);
	}

	public void deleteComment(String CommentId) {
		// TODO Auto-generated method stub
		blogCommentDao.deleteComment(CommentId);
	}

	public BlogComment getById(String blogId) {
		// TODO Auto-generated method stub
		return blogCommentDao.getById(blogId);
	}

}
