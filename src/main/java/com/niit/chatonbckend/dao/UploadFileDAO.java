package com.niit.chatonbckend.dao;

import com.niit.chatonbackend.model.UploadFile;

public interface UploadFileDAO {

	void save(UploadFile uploadFile);

	UploadFile getFile(String userName);
}

