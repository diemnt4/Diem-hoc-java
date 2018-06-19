package javaDay2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex5_CheckStringByRegex {
	private static Pattern pattern; 
	public static void checkString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String a = sc.nextLine();
		if (Pattern.compile("^[A-Z]").matcher(a).matches() == true) {
			if (Pattern.compile("[^0-9]").matcher(a).matches() == true) {
				if (Pattern.compile("[^!@#$%^&*()_+]").matcher(a).matches() == true) {
					System.out.println("Congratulations!!!");
				} else System.out.println("Wrong format, please type again 3");
			} else System.out.println("Wrong format, please type again 2 ");
		} else System.out.println("Wrong format, please type again 1");
		checkString();
	}
	
	public static void main(String[] args) {
		checkString();
	}

}
