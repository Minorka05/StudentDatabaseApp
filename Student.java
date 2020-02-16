package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String  lastName;
	private String  gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance =0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//construtor prompt user to enter studnent's name and year
	public Student (){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.println("1-Freshman\n2 Sophmore\n3 Junior\n4 Senior");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		System.out.println("First name: " + this.firstName +"\n" + "Lastname: " + this.lastName +"\n" +
		"Grade: " + this.gradeYear + "\n" + "Student ID: " + studentID);
		
		
	}
	
	//generate an ID
	private void setStudentID() {
		//grade level + ID 
		id++;
		this.studentID = gradeYear + "" + id;		
	}
	
	//Enroll in courses
	public void enroll(){
		//get inside a loop, user hits 0
		do {
		
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		} else {
			break;}
		
		}while(1 != 0);
		//System.out.println("Enrolled in: " + courses);
		System.out.println("tuition Balance: " + tuitionBalance);
	} 
	
	//view Balance
	public void viewBalance() {
		System.out.println("your balance is: $" + tuitionBalance);
		
	}
	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
;		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled: " + courses +
				"\nStudent ID: " + studentID +
				"\nGrade Level: " + gradeYear +
				"\n Balance: " + tuitionBalance;
	}
	

}
