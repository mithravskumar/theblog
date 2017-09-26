package com.niit.chatonbckend.dao;
import java.util.List;

import java.util.List;

import com.niit.chatonbackend.model.Blog;

public interface BlogDAO {

	List<Blog> getAllblogs();

	boolean saveBlog(Blog blog);

	boolean updateStatus(Blog blog);
	
	void deleteBlog(String blogId);

	Blog getBlogById(String blogId);
	
	Blog updateBlog(String blogId,Blog blog);
	
	void increaseLikes(String blogId);
	
	void increaseDislikes(String blogId);
}




