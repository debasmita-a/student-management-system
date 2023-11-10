package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Ask how many students we want to add
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student students[] = new Student[numOfStudents];
		
		//Add students
		for(Student s : students) {
			s = new Student();
			s.enroll();
			s.payTuition();
			System.out.println(s.showInfo());
		}
	}

}
