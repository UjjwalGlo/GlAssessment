/*Inserting a record
ABC International School wants to computerize students details.
The school maintains a database of students in MYSQL.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table.
The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student
Write a Java program to insert some records to the table and display all the records from student table
*/

package com.college.controller;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.college.dao.StudentDao;//import StudentDao class
import com.college.model.Student;//import student Class
import com.college.service.StudentService;//import StudentService class

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();

			try {
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4)
					rollno = 0;
			} catch (Exception e) {
			}
		} while (rollno == 0);

		String studentName = "";
		boolean lowercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();

			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}

		} while (studentName.length() > 20 || lowercasefound);

		System.out.print("Enter standard: ");
		String standard = sc.nextLine();
		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();

		Double fees = 0.0;
		do {
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);

		Student student = new Student(rollno, studentName, standard, dob, fees);

		StudentService service = new StudentService();

		String res = service.Insert(student);
		System.out.println("data without roll num want to display data");
		StudentDao sd = new StudentDao();
		sd.display();
		System.out.println(res);

	}

}