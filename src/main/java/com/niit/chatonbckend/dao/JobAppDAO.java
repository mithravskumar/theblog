package com.niit.chatonbckend.dao;

import java.util.List;

import com.niit.chatonbackend.model.JobApplication;

public interface JobAppDAO {

	boolean applyJob(JobApplication jobapp);

	List<JobApplication> getAppliedJobs(String userId);
}

