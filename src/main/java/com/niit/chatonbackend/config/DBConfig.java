package com.niit.chatonbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.chatonbackend.model.BaseDomain;
import com.niit.chatonbackend.model.Blog;
import com.niit.chatonbackend.model.BlogComment;
import com.niit.chatonbackend.model.Friend;
import com.niit.chatonbackend.model.Job;
import com.niit.chatonbackend.model.JobApplication;
import com.niit.chatonbackend.model.UploadFile;
import com.niit.chatonbackend.model.User;

@Configuration
@EnableTransactionManagement
public class DBConfig {

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder lsf = new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.use_sql_commnets", "true");
		lsf.addProperties(hibernateProperties);
		return lsf.addAnnotatedClass(User.class).addAnnotatedClass(BaseDomain.class).addAnnotatedClass(Blog.class)
				.addAnnotatedClass(Job.class).addAnnotatedClass(Friend.class).addAnnotatedClass(BlogComment.class)
				.addAnnotatedClass(JobApplication.class).addAnnotatedClass(UploadFile.class).buildSessionFactory();

	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/dt2");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	public HibernateTransactionManager hibTransManager() {
		return new HibernateTransactionManager(sessionFactory());
	}
}
