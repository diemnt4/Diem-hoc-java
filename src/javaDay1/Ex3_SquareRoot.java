package javaDay1;

import java.util.Scanner;

public class Ex3_SquareRoot {

	public static void squareRoot() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter a number: ");
			int number = sc.nextInt();
			System.out.println("Square Root of " + number + " is " + Math.sqrt(number));
			
			squareRoot();		
		} catch (Exception e) {
			System.out.println("Please re-enter. yout nust enter the numberic");
			squareRoot();
		}
	}
	
	public static void main(String[] args) {
		squareRoot();
	}

}
