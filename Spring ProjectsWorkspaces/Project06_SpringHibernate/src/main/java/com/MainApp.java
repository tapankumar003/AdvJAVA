package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        TraineeDao td = (TraineeDao) ap.getBean("dao");
        Trainee t=new Trainee("Vinod", 24);
        System.out.println(td.addTrainee(t));
        System.out.println("All Trainees are");
        System.out.println(td.getAllTrainee());
	}

}
