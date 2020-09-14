package com.nt.log;

import java.util.Scanner;

public class Find_Area {
	
	public static void main (String args[]) {
		
		Scanner sc=null;
		 float pi=3.14f;
		
		float area,cf;
		sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=sc.nextInt();
	   
		area=pi*r*r;
		System.out.println("Area of circumfarence::"+area);
		cf=2*pi*r;
		System.out.println("Cercumferece of the circle::"+cf);
		
		
	}

}
