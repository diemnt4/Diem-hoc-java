package javaday4;

import java.util.Scanner;

public class Ex7_ShowOddEvent {
	
	public static void showEven(int n) {
		System.out.println("Even");
		for (int i =0; i <= n; i ++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void showOdd(int n) {
		System.out.println("Odd");
		for (int i =0; i <= n; i ++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int n =0;
		try {
			System.out.println("Please enter a number: ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt(); 
		} catch (Exception e) {
			System.out.println("Sorry. You must enter a number");
		} finally {
			showEven(n);
			showOdd(n);
		}
	}
}
