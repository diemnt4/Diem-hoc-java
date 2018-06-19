package javaOPPExecute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TeacherManagement {
	public static Scanner sc = new Scanner(System.in);
	public static List listTeacher = new ArrayList();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void teacherManagement() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				System.out.println("Select action with teacher: ");
				System.out.println("1. Add teacher");
				System.out.println("2. Delete teacher");
				System.out.println("3. Show list teacher");
				System.out.println("4. Back to main menu");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					addTeacher();
					break;
				case 2:
					deleteTeacher();
					break;
				case 3:
					showTeacher();
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

	public static void addTeacher() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {

				condition = true;

				Teacher tc = new Teacher();
				System.out.println("Enter id for teacher: ");
				tc.setId(br.readLine());
				System.out.println("Enter name for teacher: ");
				tc.setName(br.readLine());
				listTeacher.add(tc);

			} catch (Exception e) {
				System.out.println("Error. Please try again");
				condition = false;
			}
		}

	}

	public static void deleteTeacher() throws IOException {
		System.out.println("Enter teacher name want to delete: ");
		String delId = br.readLine();
		Iterator<Student> itr = listTeacher.iterator();
		while (itr.hasNext()) {
			if (delId.equals(itr.next().getName())) {
				itr.remove();
			}

		}

	}

	public static void showTeacher() {
		for (int i = 0; i < listTeacher.size(); i++) {
			System.out.println("|" + ((Teacher) listTeacher.get(i)).getId() + "|"
					+ ((Teacher) listTeacher.get(i)).getName() + "|");
		}
	}

}
