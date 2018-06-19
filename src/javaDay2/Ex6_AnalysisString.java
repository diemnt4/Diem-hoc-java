package javaDay2;

public class Ex6_AnalysisString {

	public static void main(String[] args) {
		String a = "Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
		for(String s :  a.split(", ")){
		      if (s.indexOf("|") != -1) {
		    	  for(String s1 : s.split(" \\| ")){
		    		  System.out.println(s1);
		    	  }
		      } 
		      else  System.out.println(s);	 
		}
	}

}
