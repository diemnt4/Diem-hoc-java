package javaday4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ArrayInterface {
	
	public static void arrayInterface() {
		Scanner sc = new Scanner(System.in);
		List a1 = new ArrayList();
		int size = 0;
		try {
			System.out.println("Please enter size of array");
			size = sc.nextInt();
			for (int i = 0; i < size; i++) {
		        System.out.print("Please enter item " + i + ": ");
		        a1.add(sc.nextInt());
		    }
			System.out.println("Items in ArrayList");
		    System.out.println(a1);
		    arrayInterface();
		} catch (Exception e) {
			System.out.println("Please enter a number is size of array");
			arrayInterface();
		}
	}

	public static void main(String[] args) {
		 arrayInterface();
	}

}
