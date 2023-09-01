package com.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.SomeBO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		SomeBO bo = (SomeBO) ap.getBean("bo");
		bo.validate();
		try {
			bo.validate(19);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
