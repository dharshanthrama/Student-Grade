package com.student;

import java.util.Scanner;

public class student_grade {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("STUDENT GRADE CALCULATOR");
	System.out.println("ENTER NUMBER OF SUBJECTS");
	
	int no_subjects = sc.nextInt();
	int total = 0;
	for(int i=0;i<no_subjects;i++) {
		
		System.out.println("ENTER MARKS OBTAINED IN   " + (i+1)+ " :  ");
		int marks = sc.nextInt();
		total+=marks;
	}
	
	double average =(double)total/no_subjects;
	
	char Grade;
	if(average>=90) {
		Grade ='O';
	}else if(average>=80) {
		Grade ='A';
	}else if(average>=70) {
		Grade ='B';
	}else if(average>=60) {
		Grade ='C';
	}else if(average>=50) {
		Grade ='D';
	}else {
		Grade ='F';
	}
	System.out.println("TOTAL MARKS SCORED IN " + total);
	System.out.println("AVERAGE PERCENTAGE GAINED IS " + average + " %");
	System.out.println("GRADE  :" + Grade);
	}

}
