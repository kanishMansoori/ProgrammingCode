package com.nt.log;

import java.util.Scanner;

public class BabyAge {

	public static void main(String[] args) {
//		int age;
//		float yr,month,tday;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the baby age in days");
//		age=sc.nextInt();
//		yr=age/365;
//		month=yr*12;
//		System.out.println("year"+yr+"month"+month);
		
		//some changes
		int cty=20;
		int r=50;
		
		String alph;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		alph=sc.next();
		
		int c=alph.charAt(0);
		System.out.println("c"+c);
		if(c>=65 && c<=123) {
			c=c+32;
			char i=(char) c;
			System.out.println("Next to next char is "+i);
		}
		else {
			System.out.println("Enter valid alphabet");
		}

	}

}