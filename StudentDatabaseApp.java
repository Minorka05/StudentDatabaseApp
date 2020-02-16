package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());

		
		//Aks how many student we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOFStudent = in.nextInt();
		Student[] students = new Student[numOFStudent];
		for (int n=0;n< numOFStudent; n++) {
			students [n] = new Student();
			students [n].enroll();
			students [n].payTuition();
			System.out.println(students [n].toString());
		}
	}

}
