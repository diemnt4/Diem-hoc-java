package javaDay4_Ex9;

import java.util.Scanner;

public class Main {
	
	public static void selectObject() {
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		int a = 0;
		while(condition == false) {
			try {
				System.out.println("Select object you want to query :");
				System.out.println("1. Department");
				System.out.println("2. Employee");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					DepartmentManagement.departmentManagement();
					break;
				case 2:
					EmployeeManagement.employeeManagement();
					break;
				default:
					System.out.println( "Not valid. Please re-select");
					condition = false;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error. please try again");
				condition = false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		selectObject();
	}

}
