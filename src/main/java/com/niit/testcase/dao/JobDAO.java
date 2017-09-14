package com.niit.testcase.dao;

import com.niit.testcase.model.Job;

public interface JobDAO {

	boolean saveJob(Job job);
	
	Job updateJob(String jobId,Job job);
	
	boolean removeJob(String jobId);
}
