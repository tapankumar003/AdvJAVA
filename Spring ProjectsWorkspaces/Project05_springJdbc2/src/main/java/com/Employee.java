package com;

public class Employee {
   private int eid;
   private String ename;
   private int age;
   private String password;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", password=" + password + "]";
}
   
   
}
