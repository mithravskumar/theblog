package com.niit.collaborate.dao;
import com.niit.collaborate.model.Uploadfile;

public interface UploadfileDAO {

	void save(Uploadfile uploadfile);

	Uploadfile getFile(String userName);
}

