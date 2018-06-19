package javaDay4_Ex1;

public class Becgie extends Dog {
	public void bark(){
        System.out.println("yack");
    }
	
	public void bark(int n) {
		for( int i =0; i < n; i ++) {
			System.out.println("yoi yoi");
		}
	}
}
