package com.niit.chatonbackend.service;

import java.util.List;

import com.niit.chatonbackend.model.JobApplication;

public interface JobAppService {

	boolean applyJob(JobApplication jobApp);
	
	List<JobApplication> getAppliedJobs(String userId);
}

