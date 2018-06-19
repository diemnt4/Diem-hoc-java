package javaDay1;

import java.util.Scanner;

public class Ex4_QuadraticEquation {

	public static void quadraticEquation() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the first coefficient of the quadratic equationt : ");
			int number1 = sc.nextInt();
			System.out.println("Please enter the second coefficient of the quadratic equationt : ");
			int number2 = sc.nextInt();
			System.out.println("Please enter the third coefficient of the quadratic equationt : ");
			int number3 = sc.nextInt();
			int delta = number2 * number2 - 4 * number1 * number3;
			double s1 = (-number2 + Math.sqrt(delta)) / (2 * number1); 
			double s2 = (-number2 - Math.sqrt(delta)) / (2 * number1);
			System.out.println("The first solution of the quadratic equationt is " + s1);
			System.out.println("The second solution of the quadratic equationt is " + s2);
			quadraticEquation();		
		} catch (Exception e) {
			System.out.println("Please re-enter. yout nust enter the numberic");
			quadraticEquation();
		}
	}
	
	public static void main(String[] args) {
		quadraticEquation();
	}

}
