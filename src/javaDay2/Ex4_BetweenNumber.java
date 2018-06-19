package javaDay2;

import java.util.Scanner;

public class Ex4_BetweenNumber {
	public static void betwwenNumber() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter first number");
			int number1 = sc.nextInt();
			System.out.println("Please enter second nunber");
			int number2 = sc.nextInt();
			if (number1 > number2) {
				while (number1 != number2 - 1) {
					System.out.println(number1);
					number1 --;
				}
			} else {
				while (number1 != number2 + 1) {
					System.out.println(number1);
					number1 ++;
				}
			}
			betwwenNumber();
		} catch (Exception e) {
			System.out.println("You must input numeric type");
			betwwenNumber();
		}	
	}
	
	public static void main(String[] args) {
		betwwenNumber();
	}

}
