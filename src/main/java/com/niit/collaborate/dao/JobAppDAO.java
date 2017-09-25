package com.niit.collaborate.dao;
import java.util.List;

import com.niit.collaborate.model.JobApplication;

public interface JobAppDAO {

	boolean applyJob(JobApplication jobapp);

	List<JobApplication> getAppliedJobs(String userId);
}
