/*************************************************
Project: Silly Story 01
Session : Week 2
Author: XXXXX
Purpose: Application File
Exploring storing data in variables, getting
user input, and displaying data to the screen.
Also doing simple calculations with variables.
**************************************************/

import java.util.Scanner;
public class StudentReport{
	public static void main (String args[]){
		
		//Varibale declaration --- local variables 
		String studentName;
		String studentNumber;
		int m1, m2,m3;
		int total;
		float average;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		// getting the user input
		System.out.print("Enter student number : ");
		studentNumber = input.next();
		System.out.print("Enter student name : ");
		studentName= input.next();
		System.out.print("Enter marks for the modules 1 : ");
		m1 = input.nextInt();
		System.out.print("Enter marks for the modules 2 : ");
		m2 = input.nextInt();
		System.out.print("Enter marks for the modules 3 : ");
		m3 = input.nextInt();
		
		// calculating the total and the average
		total = m1+m2+m3;
		average = total / 3;
		
		// deciding the grade --- use selection --- if else
		
		/*if (condition - local condition -- either true or false){
			statements to execute when the condition is true
		}
		else{
			statements to execute when the condition is false
		} 
		- brackets are not essential. But when you more than one statements then u should
		- good practice --- have them
		- else is optional
		- if you have more than two options then you need to go for if / else / if - nested
		*/

		if (average < 50){
			grade = "Fail";   // single statement 
			System.out.println("In if");
		}
		else
			if(average < 60)
				grade = "Pass";
			else
				if(average < 70)
					grade = "Credit";
				else 
					if(average < 80)
						grade = "Veru Good Pass";
					else
						grade = "Distinction";

		//System.out.flush();
	
		System.out.println("");
		System.out.println("============ Student Report =================\n");
		System.out.println("	Student Number : "+studentNumber);
		System.out.println("	Student Name   : "+studentName);
		System.out.println("	Total marks    : "+total);
		System.out.println("	Average marks  : "+average);
		System.out.println("	Grade          : "+grade+"\n");
		System.out.println("=============================================");
		
	}
}