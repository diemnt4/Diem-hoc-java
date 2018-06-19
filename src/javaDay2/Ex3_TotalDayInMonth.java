package javaDay2;

import java.util.Scanner;

public class Ex3_TotalDayInMonth {
	public static void totalDayInMonth() {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		try {
			System.out.println("Please enter month");
			month = sc.nextInt();
			switch (month) {
			case 1:
				System.out.println("January has 31 days");
				break;
			case 2:
				System.out.println("February has 29 or 28 days");
				break;
			case 3:
				System.out.println("March has 31 days");
				break;
			case 4:
				System.out.println("April has 30 days");
				break;	
			case 5:
				System.out.println("May has 31 days");
				break;
			case 6:
				System.out.println("June has 30 days");
				break;
			case 7:
				System.out.println("July has 30 days");
				break;
			case 8:
				System.out.println("August has 30 days");
				break;
			case 9:
				System.out.println("September has 30 days");
				break;
			case 10:
				System.out.println("October has 30 days");
				break;
			case 11:
				System.out.println("November has 30 days");
				break;
			case 12:
				System.out.println("December has 30 days");
				break;
			default:
				System.out.println( month + " is invalid month");
				break;
			}
			totalDayInMonth();
		} catch (Exception e) {
			System.out.println("You must input numeric type");
			totalDayInMonth();
		}
	}
	public static void main(String[] args) {
		totalDayInMonth();
	}

}
