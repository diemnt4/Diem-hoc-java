package javaOPPExecute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClassManagement {
	public static Scanner sc = new Scanner(System.in);
	public static List listEClass = new ArrayList();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void classManagement() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				System.out.println("Select action with class: ");
				System.out.println("1. Add class");
				System.out.println("2. Delete class");
				System.out.println("3. Show list class");
				System.out.println("4. Back to main menu");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					addClass();
					break;
				case 2:
					deleteClass();
					break;
				case 3:
					showClass();
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

	public static void addClass() {
		boolean condition = false;
		while (condition == false) {
			try {

				condition = true;
				Class cl = new Class();
				System.out.println("Enter id for class: ");
				cl.setId(br.readLine());
				System.out.println("Enter name for class: ");
				cl.setName(br.readLine());
				listEClass.add(cl);
			} catch (Exception e) {
				System.out.println("Error. Please try again");
				condition = false;
			}
		}

	}

	public static void deleteClass() throws IOException {
		System.out.println("Enter class name want to delete: ");
		String delName = br.readLine();
		Iterator<Class> itr = listEClass.iterator();
		while (itr.hasNext()) {
			if (delName.equals(itr.next().getName())) {
				itr.remove();
			}
		}
	}

	public static void showClass() {
		for (int i = 0; i < listEClass.size(); i++) {
			System.out.println(
					"|" + ((Class) listEClass.get(i)).getId() + "|" + ((Class) listEClass.get(i)).getName() + "|");
		}
	}
}
