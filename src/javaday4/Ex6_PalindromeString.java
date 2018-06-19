package javaday4;

import java.util.Scanner;

public class Ex6_PalindromeString {
	
	public static void checkPalindromeString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = sc.nextLine();
		String reverse = new StringBuffer(s).reverse().toString();
		if (s.equals(reverse)) {
			System.out.println(s + " is Palindrome String");
		} else System.out.println(s + " is not Palindrome String");
		checkPalindromeString();
	}
	public static void main(String[] args) {
		checkPalindromeString();
	}

}
