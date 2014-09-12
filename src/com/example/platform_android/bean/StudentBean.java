package com.example.platform_android.bean;



public class StudentBean {
	private String number;
	private String name;
	private int sex;
	private String grade;
	private String major;
	private String myClass;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		if(sex==0)
			return "Å®";
		else {
			return "ÄÐ";
		}
		
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMyClass() {
		return myClass;
	}
	public void setMyClass(String myClass) {
		this.myClass = myClass;
	}
	
}
