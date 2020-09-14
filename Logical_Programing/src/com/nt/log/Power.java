package com.nt.log;

import java.util.Scanner;

public class Power {
	public static void main(String... args) {
		long power=1;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base and power value");
		int b=sc.nextInt();
		int p=sc.nextInt();
	   while(p>=1) {
		   power=power*b;
		   System.out.println(power);
		   sum=sum+power;
		  
		   p--;
		   
	   }
			
	   System.out.println(sum);
		
	 
		 
   }
}
