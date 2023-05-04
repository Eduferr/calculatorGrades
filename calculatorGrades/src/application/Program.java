package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Insert the student's name: ");
		student.name = sc.nextLine();
		System.out.print("Insert the first grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Insert the second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Insert the third grade: ");
		student.grade3 = sc.nextDouble();
		System.out.println();
		System.out.printf("Final grade = %.2f%n", student.finalGrade());

		if (student.finalGrade() >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}

		sc.close();

	}

}
