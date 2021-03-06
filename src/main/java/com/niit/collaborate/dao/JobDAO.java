package com.niit.collaborate.dao;
import java.util.List;

import com.niit.collaborate.model.Job;

public interface JobDAO {

	List<Job> getAllJobs();
	
	Job getJobById(String jobId);
	
	boolean saveJob(Job job);
	
	Job updateJob(String jobId,Job job);
	
	boolean removeJob(String jobId);
	
	
	
 }

