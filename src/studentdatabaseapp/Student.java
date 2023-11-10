package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeYear; //Freshman, Sophomore, Junior, Senior
	private String studentID; //5 digits - first digit being the gradeYear
	private String courses = "";
	private static int courseCost = 600;
	private int tuitionBalance;
	private static int id = 1000;
	
	//Constructor to prompt user to enter name and year of a student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastname = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentID);
		
		
	}

	
	//Create a method that generates an unique student ID
	private void setStudentID() {
		//grade level + ID
		id++;
		this.studentID = gradeYear + ""+ id;
	}
	//Create a method to enroll courses
	public void enroll() {
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + courseCost;
		}else {
			break;
		}
		}while(1!=0);
		System.out.println("ENROLLED IN: "+ courses);
		System.out.println("TUITION BALANCE: "+tuitionBalance);
		
	}
	//Create a method to check/view balance
	public void viewBalance() {
		System.out.println("YOUR BALANCE IS: "+tuitionBalance);
	}
	//Pay tuition
	public void payTuition() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter payment amount: ");
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	//Create a method to display info : name, id, courses enrolled and balance
	public String showInfo() {
		return "Name: " + firstname + " " + lastname +
				"\nStudent ID: " + studentID +
				"\nGrade Year: " + gradeYear + 
				"\nCourses enrolled: " + courses +
	            "\nBalance is: $" + tuitionBalance;
	}
}
