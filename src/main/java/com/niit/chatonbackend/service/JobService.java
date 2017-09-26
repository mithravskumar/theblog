package com.niit.chatonbackend.service;

import java.util.List;

import com.niit.chatonbackend.model.Job;

public interface JobService {

	List<Job> getAllJobs();

	Job getJobById(String jobId);

	boolean saveJob(Job job);

	Job updateJob(String jobId, Job job);

	boolean removeJob(String jobId);
}

