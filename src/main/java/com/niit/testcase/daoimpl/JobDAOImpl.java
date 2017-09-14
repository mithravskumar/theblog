package com.niit.testcase.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.testcase.dao.JobDAO;
import com.niit.testcase.model.Job;

@Component
@Repository("jobDAO")
@Transactional
public class JobDAOImpl implements JobDAO{
	
	private static Logger log = LoggerFactory.getLogger(JobDAOImpl.class);
	@Autowired(required=true)
	private SessionFactory sessionFactory;//user defined constructor with one argument

	public JobDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}


	public boolean saveJob(Job job) {
		try{
			sessionFactory.getCurrentSession().save(job);		//getCurrentSession will establish connection to existing DB 
		}
		catch(Exception e){
			e.printStackTrace();								//printStackTrace will print all the exceptions.
			return false;
		}
		return true;

	}

	public Job updateJob(String jobId, Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeJob(String jobId) {
		// TODO Auto-generated method stub
		return false;
	}

}
