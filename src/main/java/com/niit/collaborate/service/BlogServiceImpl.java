package com.niit.collaborate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.BlogDAO;
import com.niit.collaborate.model.Blog;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDAO blogDao;

	@Transactional
	public List<Blog> getAllblogs() {
		return blogDao.getAllblogs();
	}

	public boolean saveBlog(Blog blog) {
		return blogDao.saveBlog(blog);
	}

	public boolean updateStatus(Blog blog) {
		return blogDao.updateStatus(blog);
	}

	public Blog getBlogById(String blogId) {
		return blogDao.getBlogById(blogId);
	}

	public Blog updateBlog(String blogId, Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.updateBlog(blogId, blog);
	}

	public void increaseLikes(String blogId) {
		// TODO Auto-generated method stub
		blogDao.increaseLikes(blogId);
	}

	public void increaseDislikes(String blogId) {
		// TODO Auto-generated method stub
		blogDao.increaseDislikes(blogId);
	}

	public void deleteBlog(String blogId) {
		// TODO Auto-generated method stub
		blogDao.deleteBlog(blogId);
	}

}

