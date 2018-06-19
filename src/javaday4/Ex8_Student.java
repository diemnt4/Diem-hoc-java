package javaday4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8_Student { 
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static List<String> addStudent() {
		List listStudent = new ArrayList();
		int numberST = 0;
		try {
			System.out.println("Please enter number of student: ");
			numberST = sc.nextInt();
			for (int i = 0; i < numberST; i++) {
		        System.out.print("Please enter item " + i + ": ");
		        listStudent.add(br.readLine());
		    }
		} catch (Exception e) {
			System.out.println("You must enter a number!!!");
			addStudent();
		}
		return listStudent;
	}
	
	public static void showStudent(List listStudent) {
		System.out.println("List student: " + listStudent );
	}
	
	public static void deleteStudent(List listStudent) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student name want to delete: ");
		String student = sc.nextLine();
		listStudent.remove(student);
		System.out.println(listStudent);
	}

	public static void main(String[] args) {
		List st = new ArrayList();
		st = addStudent();
		showStudent(st);
		deleteStudent(st);
	}

}
