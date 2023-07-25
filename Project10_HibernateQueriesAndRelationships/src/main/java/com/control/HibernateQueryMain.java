package com.control;

import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.to.Student;

public class HibernateQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Student.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Student s1 = new Student("Ravi",16,"Tenth");
//		Student s2 = new Student("Govinda",17,"Tenth");
//		Student s3 = new Student("Abhay",19,"Tenth");
//		Student s4 = new Student("Mantu",13,"Eighth");
//		Student s5 = new Student("Shyam",12,"Eighth");
//		Student s6 = new Student("Jyoti",15,"Seventh");
//		Student s7 = new Student("Sakhsi",14,"Seventh");
//		Student s8 = new Student("Padma",16,"Ninth");
//		Student s9 = new Student("Yash",15,"Seventh");
//		Student s10 = new Student("Meenakhsi",17,"Ninth");
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
//		session.save(s5);
//		session.save(s6);
//		session.save(s7);
//		session.save(s8);
//		session.save(s9);		
//		session.save(s10);
        
//		dynamic add
//		Scanner scan = new Scanner(System.in);
//		Student stud= new Student();
//		System.out.println("Enter student name: ");
//		stud.setStudentName(scan.next());
//		System.out.println("Enter student age:");
//		stud.setAge(scan.nextInt());
//		System.out.println("Enter student class name:");
//		stud.setClassName(scan.next());
//		session.save(stud);
	
//		Query query = session.createQuery("from Student");
//		List<Student> studentList = query.list();
//		System.out.println("Student Details:");
//		for(Student s:studentList) {
//			System.out.println(s);
//		}
	}

}
