package javaDay2;

import java.util.Scanner;

public class Ex2_PositiveNegative {
	public static void positiveNegative() {
		Scanner  sc = new Scanner(System.in);
		try {
			System.out.println("Please enter a number");
			int number = sc.nextInt();
			if (number >= 0) {
				System.out.println(number + " is positive");
			} else System.out.println(number + " is negative");
			positiveNegative();
		} catch (Exception e) {
			System.out.println("You must input numeric type");
			positiveNegative();
		}
	}
	public static void main(String[] args) {
		positiveNegative();
	}


}
