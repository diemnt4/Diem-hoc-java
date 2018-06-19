package javaOPPExecute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
	public static Scanner sc = new Scanner(System.in);
	public static List listStudent = new ArrayList();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void studentManagement() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				System.out.println("Select action with student: ");
				System.out.println("1. Add student");
				System.out.println("2. Delete student");
				System.out.println("3. Show list student");
				System.out.println("4. Back to main menu");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					addStudent();
					break;
				case 2:
					deleteStudent();
					break;
				case 3:
					showStudent();
					break;
				case 4:
					MainManagement.selectObject();
					break;
				default:
					System.out.println("Not valid. Please re-select");
					condition = false;
					break;
				}
				condition = false;
			} catch (Exception e) {
				System.out.println("You must input numeric type");
				condition = false;
			}
		}

	}

	public static void addStudent() {
		boolean condition = false;
		while (condition == false) {
			try {
				Student st = new Student();
				System.out.println("Enter id for student: ");
				st.setId(br.readLine());
				System.out.println("Enter name for student: ");
				st.setName(br.readLine());
				listStudent.add(st);

			} catch (Exception e) {
				System.out.println("Error. Please try again");
				condition = false;
			}
		}

	}

	public static void deleteStudent() throws IOException {
		System.out.println("Enter student name want to delete: ");
		String delName = br.readLine();
		Iterator<Student> itr = listStudent.iterator();
		while (itr.hasNext()) {
			if (delName.equals(itr.next().getName())) {
				itr.remove();

			}
		}

	}

	public static void showStudent() {
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println("|" + ((Student) listStudent.get(i)).getId() + "|"
					+ ((Student) listStudent.get(i)).getName() + "|");
		}
	}

}
