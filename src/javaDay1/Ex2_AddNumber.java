package javaDay1;

import java.util.Scanner;

public class Ex2_AddNumber {
	public static void totalNumber() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the first number: ");
			int firstNumber = sc.nextInt();
			System.out.println("Please enter the secon number: ");
			int secondNumber = sc.nextInt();
			System.out.println("The total of 2 numbers: " + (firstNumber + secondNumber));
			totalNumber();		
		} catch (Exception e) {
			System.out.println("Please re-enter. yout nust enter the numberic");
			totalNumber();
		}
	}
	
	public static void main(String[] args) {
		totalNumber();
	}

}
