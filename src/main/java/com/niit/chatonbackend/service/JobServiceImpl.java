package com.niit.chatonbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.chatonbckend.dao.JobDAO;
import com.niit.chatonbackend.model.Job;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDAO jobDao;

	public JobDAO getJobDao() {
		return jobDao;
	}

	public void setJobDao(JobDAO jobDao) {
		this.jobDao = jobDao;
	}

	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}

	public Job getJobById(String jobId) {
		return jobDao.getJobById(jobId);
	}

	public boolean saveJob(Job job) {
		return jobDao.saveJob(job);
	}

	public Job updateJob(String jobId, Job job) {
		return jobDao.updateJob(jobId, job);
	}

	public boolean removeJob(String jobId) {
		return jobDao.removeJob(jobId);
	}

}
