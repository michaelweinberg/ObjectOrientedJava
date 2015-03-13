package com.baseballavgs;

import java.util.Scanner;


public class BaseballAverageCalc {
	public static void main(String[] args) {
		BaseballAverageCalc bac = new BaseballAverageCalc();
			bac.get();
		  bac.calculateBA();
		  bac.displayBA();
	}
	
	Scanner scan = new Scanner(System.in);	
	private double battingAvg;
	private double onbaseAvg;
	private double plateApps;
	private double walks;
	private double atbats;
	private double hits;
	
	
	public void get(){
		System.out.println("Enter the number of at bats");
		 atbats = scan.nextDouble();
	
		System.out.println("Enter the number of walks");
		 walks = scan.nextDouble();
		System.out.println("Enter the number of hits");
		 hits = scan.nextDouble();
		
	}
	
	
	
	public void calculateBA(){
		System.out.println(atbats);
		 onbaseAvg = (walks+hits)/atbats;
		 
		 battingAvg = hits/atbats;
		

	}
	public void displayBA(){
		System.out.println("Batting Average " + battingAvg);
		System.out.println("On Base Average " + onbaseAvg);
	}
	
	
	
	
	
}
