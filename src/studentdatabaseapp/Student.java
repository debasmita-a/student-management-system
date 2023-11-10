package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeYear; //Freshman, Sophomore, Junior, Senior
	private int id; //5 digits
	private String courses;
	private int courseCost = 600;
	private int tuitionBalance;
	
	//Constructor to prompt user to enter name and year of a student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstname = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastname = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstname + " " + lastname + " " + gradeYear);
	}

	
	//Create a method that generates an unique student ID
	
	//Create a method to enroll courses
	
	//Create a method to check/view balance
	
	//Pay tuition
	
	//Create a method to display info : name, id, courses enrolled and balance
}
