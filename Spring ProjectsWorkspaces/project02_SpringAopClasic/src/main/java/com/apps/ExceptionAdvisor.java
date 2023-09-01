package com.apps;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice{
	
	public void afterThrowing(Exception e) {
		System.out.println("additional concern if exception occurs");
	}

}
