package com.niit.collaborate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.JobAppDAO;
import com.niit.collaborate.model.JobApplication;

@Service
public class JobAppServiceImpl implements JobAppService {

	@Autowired
	private JobAppDAO jobAppDao;

	public boolean applyJob(JobApplication jobApp) {
		// TODO Auto-generated method stub
		return jobAppDao.applyJob(jobApp);
	}

	public List<JobApplication> getAppliedJobs(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

