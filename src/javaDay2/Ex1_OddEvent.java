package javaDay2;

import java.util.Scanner;

public class Ex1_OddEvent {
	public static void eventOdd() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter a number!!!");
			int number = sc.nextInt();
			if (number % 2 == 0) {
				System.out.println(number +  " is event number");
			} else System.out.println(number +  " is odd number");
			eventOdd();
		} catch (Exception e) {
			System.out.println("You must input numeric type");
			eventOdd();
		}
	}
	
	public static void main(String[] args) {
		eventOdd();
	}


}
