package com.to;

public class SomeBO {

	public void validate() {
		System.out.println("vaidation stuff from BO");
	}
	public void validate(int age) throws Exception{
		if(age<18) {
			throw new ArithmeticException("not valid age");
		}
		else {
			System.out.println("Vote confirmed");
		}
	}
}
