package javaOPPExecute;

import java.util.Scanner;

public class MainManagement {
	
	public static void selectObject() {
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		int a = 0;
		while(condition == false) {
			try {
				System.out.println("Select object you want to query :");
				System.out.println("1.Class");
				System.out.println("2.Teacher");
				System.out.println("3.Student");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					ClassManagement.classManagement();
					break;
				case 2:
					TeacherManagement.teacherManagement();
					break;
				case 3:
					StudentManagement.studentManagement();
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
