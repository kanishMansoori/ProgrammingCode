package com.nt.log;

import java.util.Scanner;

public class Printing_Number {

	public static void main(String... args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		while(i<=n) {
			System.out.print(n);
			  n--;	
		}
		
		
		

	}

}
