package com.niit.chatonbckend.dao;

import java.util.List;

import com.niit.chatonbackend.model.Job;

public interface JobDAO {

	List<Job> getAllJobs();
	
	Job getJobById(String jobId);
	
	boolean saveJob(Job job);
	
	Job updateJob(String jobId,Job job);
	
	boolean removeJob(String jobId);
	
	
	
 }

