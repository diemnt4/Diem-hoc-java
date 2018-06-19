package javaDay4_Ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DepartmentManagement {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Scanner sc = new Scanner(System.in);
	public static List listDepartment = new ArrayList();

	public static void departmentManagement() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				System.out.println("Select action with department: ");
				System.out.println("1. Add department");
				System.out.println("2. Delete department");
				System.out.println("3. Show list department");
				System.out.println("4. Show list employee");
				System.out.println("5. Back to main menu");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					addDepartment();
					break;
				case 2:
					deleteDepartment();

					break;
				case 3:
					showDepartment();
					break;
				case 4:
					showListEmployee();
					break;
				case 5:
					Main.selectObject();
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

	public static void addDepartment() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				condition = true;
				Department dp = new Department();
				System.out.println("Enter id for department: ");
				dp.setId(br.readLine());
				System.out.println("Enter name for department: ");
				dp.setName(br.readLine());
				System.out.println("Enter description for department: ");
				dp.setDescription(br.readLine());
				listDepartment.add(dp);
			} catch (Exception e) {
				System.out.println("Error. Please try again");
				condition = false;
			}
		}
	}

	public static void showDepartment() {
		for (int i = 0; i < listDepartment.size(); i++) {
			System.out.println("|" + ((Department) listDepartment.get(i)).getId() + "|"
					+ ((Department) listDepartment.get(i)).getName() + "|"
					+ ((Department) listDepartment.get(i)).getDescription());
		}
	}

	public static void deleteDepartment() throws IOException {
		System.out.println("Enter department name want to delete: ");
		String delName = br.readLine();
		Iterator<Department> itr = listDepartment.iterator();
		while (itr.hasNext()) {
			if (delName.equals(itr.next().getName())) {
				itr.remove();
			}
		}
	}

	public static void showListEmployee() throws IOException {
		System.out.println("Enter department id want to show: ");
		String showId = br.readLine();
		for (int i = 0; i < EmployeeManagement.listEmployee.size(); i++) {
			if (((Employee) EmployeeManagement.listEmployee.get(i)).getDepartmentId().equals(showId)) {
				System.out.println(showId);
				System.out.println("------------------------");
				System.out.println(((Employee) EmployeeManagement.listEmployee.get(i)).getId() + "|"
						+ ((Employee) EmployeeManagement.listEmployee.get(i)).getName() + "|"
						+ ((Employee) EmployeeManagement.listEmployee.get(i)).getDescription());
				System.out.println("------------------------");
			}
		}
	}
	
}
