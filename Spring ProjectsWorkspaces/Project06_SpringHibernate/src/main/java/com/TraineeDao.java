package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class TraineeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public int addTrainee(Trainee t) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int id = (int) session.save(t);
		session.getTransaction().commit();
		return id;	
	}
	
	public List<Trainee> getAllTrainee(){

		List<Trainee> listTrainee = new ArrayList<Trainee>();
		listTrainee=hibernateTemplate.loadAll(Trainee.class);
		return listTrainee;
		
	}
	
}
