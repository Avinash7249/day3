package com.masai;

public class StatNon {
//	int n=8;
//	static double m=9;
//	
//	static void fun() {
//		System.out.println("Roll is :"+m);
//	}
//
//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//		
//		StatNon s1=new StatNon();
//		
//		System.out.println(s1.n);
//		fun();
//
//	}
//
//}
//we can access non-static variable/methods in main method with the help of object but static variable/methods 
//we access directly and with object also  (only inside the same class).



static int x;
int y;
public static void main(String[] args){
	StatNon obj1 = new StatNon();
obj1.x=10;
obj1.y=20;
System.out.println(obj1.x); //50
StatNon obj2 = new StatNon();
obj2.x=50;
obj2.y=80;

System.out.println(obj1.y); //20
System.out.println(obj2.x); //50
System.out.println(obj2.y); //80
}
}