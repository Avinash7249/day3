package com.masai;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is :"+rollNo);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.rollNo=35;
		s1.name="xyz";
		s1.marks= 100;
		s1.displayStudentDetails();
		
		Student s2=new Student();
		s2.rollNo=45;
		s2.name="eyz";
		s2.marks= 400;
		s2.displayStudentDetails();
		
		 s2=null;
		 s1=null;
		 s2.displayStudentDetails();
		 s1.displayStudentDetails();

	}

}
