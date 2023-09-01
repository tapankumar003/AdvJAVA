package com.apps;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BothAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before Method");
		invocation.proceed();
		System.out.println("AfterMethod");
		return null;
	}

}
