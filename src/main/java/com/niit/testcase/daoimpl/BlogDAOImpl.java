package com.niit.testcase.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.testcase.daoimpl.BlogDAOImpl;
import com.niit.testcase.dao.BlogDAO;
import com.niit.testcase.model.Blog;

@Component
@Repository("blogDAO")
@Transactional

public class BlogDAOImpl implements BlogDAO {

	private static Logger log = LoggerFactory.getLogger(BlogDAOImpl.class);
	@Autowired(required=true)
	private SessionFactory sessionFactory;//user defined constructor with one argument

	public BlogDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}


	@SuppressWarnings("unchecked")
	public List<Blog> getAllblogs() {
		return sessionFactory.getCurrentSession().createQuery("from Blog").list();

	}

	public boolean saveBlog(Blog blog) {
		try{
			sessionFactory.getCurrentSession().save(blog);		//getCurrentSession will establish connection to existing DB 
		}
		catch(Exception e){
			e.printStackTrace();								//printStackTrace will print all the exceptions.
			return false;
		}
		return true;

	}

	public boolean updateStatus(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBlog(String blogId) {
		try{
			sessionFactory.getCurrentSession().delete(blogId);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public Blog getBlogById(String blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog updateBlog(String blogId, Blog blog) {
		// TODO Auto-generated method stub
		return null;
	}

	public void increaseLikes(String blogId) {
		// TODO Auto-generated method stub
		
	}

	public void increaseDislikes(String blogId) {
		// TODO Auto-generated method stub
		
	}

	
}
