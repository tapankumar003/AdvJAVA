package com.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.to.SomeBO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		SomeBO bo = ap.getBean("proxy",SomeBO.class);
		bo.validate();
		try {
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
