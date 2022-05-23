package com.masai;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails()
	{
		System.out.println("couseId: "+courseId);
		System.out.println("courseName: "+courseName);
		System.out.println("courseFee: "+courseFee);
	}
	
	public static void authenticate(String userName,String password)
	{
		if(userName=="Admin" && password=="1234")
		{
			Course d1= new Course();
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter courseId: ");
			d1.courseId = sc.nextInt();
			System.out.println("Enter courseName: ");
			d1.courseName = sc.next();
			System.out.println("Enter courseFee: ");
			d1.courseFee = sc.nextInt();
			d1.displayCourseDetails();
		}
		else
		{
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		System.out.println("");
		authenticate("Ain","1");

	}
}
