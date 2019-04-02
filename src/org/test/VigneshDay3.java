package org.test;

import java.util.Scanner;

public class VigneshDay3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empId");
		int empId=sc.nextInt();
		System.out.println("enter the age");
		int Age=sc.nextInt();
		System.out.println("enter the address");
		String City=sc.next();
		if(empId==12||Age==58||City=="Chennai")
		{
			System.out.println("Senior HR");
		}
		else {
			System.out.println("HR");

		}
	}
}
