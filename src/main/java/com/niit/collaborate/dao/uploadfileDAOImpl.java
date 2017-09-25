package com.niit.collaborate.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.Uploadfile;

@Repository
public class uploadfileDAOImpl implements UploadfileDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Uploadfile uploadFile) {
		Session session = sessionFactory.openSession();
		session.save(uploadFile);
		session.flush();
		session.close();

	}

	public Uploadfile getFile(String userName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UploadFile where userName = ?");
		query.setParameter(0, userName);
		UploadfileDAO uploadFile = (UploadfileDAO) query.uniqueResult();
		session.close();
		return (Uploadfile) uploadFile;

	}

}

