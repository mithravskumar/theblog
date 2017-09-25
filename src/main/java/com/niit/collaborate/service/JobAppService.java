package com.niit.collaborate.service;

import java.util.List;

import com.niit.collaborate.model.JobApplication;

public interface JobAppService {

	boolean applyJob(JobApplication jobApp);
	
	List<JobApplication> getAppliedJobs(String userId);
}
