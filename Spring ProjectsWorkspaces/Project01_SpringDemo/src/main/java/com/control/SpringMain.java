//Setter injection and constructer injection
//
package com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.to.Employee;
import com.to.Hello;

public class SpringMain {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//Hello h=context.getBean(Hello.class);
//System.out.print(h.getMessage()+"\n"+h.getCode()+"\n"+h.getName());

//Hello h1=(Hello)context.getBean("h1");
//System.out.println(h1.getMessage()+"\n"+h1.getCode()+"\n"+h1.getName());
//
//Hello h2=(Hello)context.getBean("h2");
//System.out.print(h2.getMessage()+"\n"+h2.getCode()+"\n"+h2.getName());

Employee e1 = (Employee)context.getBean("em");
System.out.println(e1);
}
}
