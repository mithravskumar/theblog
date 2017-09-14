	package com.niit.testcase.dao;

import java.util.List;

import com.niit.testcase.model.Blog;

public interface BlogDAO {

	List<Blog> getAllblogs();

	boolean saveBlog(Blog blog);

	boolean updateStatus(Blog blog);
	
	boolean deleteBlog(String blogId);

	public Blog getBlogById(String blogId);
	
	Blog updateBlog(String blogId,Blog blog);
	
	void increaseLikes(String blogId);
	
	void increaseDislikes(String blogId);
}
