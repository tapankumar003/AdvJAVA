package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath m = new MyMath(); 
	
	@Before
	public void beforeMethod() {
		System.out.println("Before");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("After Class");
	}
	
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("After Class");
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		int result=m.sum(new int[] {1,2,3});
		assertEquals(6, result);
		System.out.println("Test 1");
		
	}
	
	@Test
	public void mysumTest() {
		int result=m.sum(new int[] {3});
		assertEquals(3, result);
		System.out.println("Test 2");
	}
	
	@Test
	public void assertMethods() {
		boolean cond = true;
		assertEquals(true, cond);
		System.out.println("Test 3");
	}
	

}
