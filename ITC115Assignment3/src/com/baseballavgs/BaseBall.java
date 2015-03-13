package com.baseballavgs;


import java.util.*;
public class BaseBall{
	
	public static void main(String[] args) {
		 BaseBall player1 = new BaseBall();

		         new Scanner(System.in);
		 
//		         String name = null;
		 
		         player1.getStats();
		 
		         player1.calcAvg();
		
		         player1.printAll();


	}
	
	Scanner scan = new Scanner(System.in);
	private double sin, doub, trip, home, hits, atbat;
	private double average;

	public void getStats(){
		System.out.print("Times at bat: ");
		atbat = scan.nextDouble();
		System.out.print("Single hits: ");
		hits = scan.nextDouble();
//		System.out.print("Double hits: ");
//		doub = scan.nextDouble();
//		System.out.print("Triple hits: ");
//		trip = scan.nextDouble();
//		System.out.print("Homeruns: ");
//		home = scan.nextDouble();
	}
	public void calcAvg(){
//		hits = sin + doub + trip + home;
		average = hits/atbat;
		
	}
	public void printAll(){
//		System.out.println("Player statistics for " + name + ":");
		System.out.println("Single hits: " + sin);
		System.out.println("Double hits: " + doub);
		System.out.println("Triple hits: " + trip);
		System.out.println("Homerun: " + home);
		System.out.println("Times at bat: " + atbat);
		System.out.println("Total hits: " + hits);
		System.out.println("Baseball average: " + average);
	}
}