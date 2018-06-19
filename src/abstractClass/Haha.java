package abstractClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Haha {
	
	public static int checkEqual(String a[], String c) {
		int n = 0;
		for (int j = 0; j < a.length; j++) {
  	  		if (c.equals(a[j]))	{
  	  			n = 1;
  	  		} else n = 0;
  	  	}
		return n;
	}
	
	public static void nhap() {
		String a[] = {"a", "b", "c"};
		String c = "c";
 		System.out.println(checkEqual(a, c));
	}
	
	
	public static void main(String[] args) {
		nhap();
  	  	
		
		
  	  	
	}
}
