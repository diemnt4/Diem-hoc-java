package abstractClass;

import java.util.Scanner;

public class ArrayExample {
	
	public static int [] inputArray() {
		Scanner sc = new Scanner(System.in);
		int [] arr = null;
		try {
			System.out.println("Please enter array size: ");
			int arrSize = sc.nextInt();
			arr = new int [arrSize];
			for (int i = 0; i < arrSize; i++) {
				try {
					System.out.println("Please enter item in " + i);
					 arr[i] = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please re-enter. yout nust enter the numberic");
					inputArray();
				}
			}
		} catch (Exception e) {
			System.out.println("Please re-enter. yout nust enter the numberic");
			inputArray();
		}
		return arr;
	}

	public static void findMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		} 
		System.out.println("Max mumber is: " + max);
	}
	
	public static void findMin(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] < min) min = arr[i];
		}
		System.out.println("Min mumber is: " + min);
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void reverseArray(int arr[]) {
		System.out.println();
		for (int i = arr.length - 1; i >= 0; i --) {
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int array[] = inputArray();
		findMax(array);
		findMin(array);
		printArray(array);
		reverseArray(array);
	}

}
