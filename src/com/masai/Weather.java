package com.masai;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assume these can have any value:
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		
		
		if(isSnowing==true ||isRaining==true||temperature<=10 &&temperature>=50) {
			System.out.println("Let’s stay home.");
		}else {
			System.out.println("Let’s go out!");
		}

	}

}
