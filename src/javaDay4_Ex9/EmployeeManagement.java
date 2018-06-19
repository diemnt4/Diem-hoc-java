package javaDay4_Ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static List listEmployee = new ArrayList();

	public static void employeeManagement() {
		boolean condition = false;
		int a = 0;
		while (condition == false) {
			try {
				System.out.println("Select action with employee: ");
				System.out.println("1. Add employee");
				System.out.println("2. Delete employee");
				System.out.println("3. Show list employee");
				System.out.println("4. Back to main menu");
				String verify = sc.nextLine();
				a = Integer.parseInt(verify);
				condition = true;
				switch (a) {
				case 1:
					addEmployee();
					break;
				case 2:
					deleteEmployee();
					break;
				case 3:
					showEmployee();
					break;
				case 4:
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

	public static void addEmployee() {
		boolean condition = false;
		while(condition == false) {
			try {
				condition = true;
				Employee ep = new Employee();
				System.out.println("Enter id for employee: ");
				ep.setId(br.readLine());
				System.out.println("Enter name for employee: ");
				ep.setName(br.readLine());
				System.out.println("Enter description for employee: ");
				ep.setDescription(br.readLine());
				System.out.println("Enter depertment id for employee: ");
				String der = enterDepartmentId();
				ep.setDepartmentId(der);
				listEmployee.add(ep);
			} catch (Exception e) {
				System.out.println("Error. Please try again");
				condition = false;
			}
		}

	}

	public static void showEmployee() {
		for (int i = 0; i < listEmployee.size(); i++) {
			System.out.println(
					"|" + ((Employee) listEmployee.get(i)).getId() + "|" + ((Employee) listEmployee.get(i)).getName()
							+ "|" + ((Employee) listEmployee.get(i)).getDescription() + "|"
							+ ((Employee) listEmployee.get(i)).getDepartmentId());
		}
	}

	public static void deleteEmployee() throws IOException {
		System.out.println("Enter employee name want to delete: ");
		String delName = br.readLine();
		Iterator<Employee> itr = listEmployee.iterator();
		while (itr.hasNext()) {
			if (delName.equals(itr.next().getName())) {
				itr.remove();
			}
		}
	}
	

	public static int checkEqual(List a, String c) {
		int n = 0;
		for (int j = 0; j < a.size(); j++) {
			System.out.println();
  	  		if (c.equals(((Department) a.get(j)).getId()))	{
  	  			n = 1;
  	  		}
  	  	}
		return n;
	}
	
	public static String enterDepartmentId() {
		System.out.println("What is your department???");
		for (int i = 0; i < DepartmentManagement.listDepartment.size(); i ++) {
			System.out.println(((Department) DepartmentManagement.listDepartment.get(i)).getId());
		}  String chosen = sc.nextLine();
		if (checkEqual(DepartmentManagement.listDepartment, chosen) == 0) { 
			System.out.println("Please re-enter");
			enterDepartmentId();
		}
		return chosen;
	}

}
