package datastructure;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);	
	System.out.println("input a");
	int a =s.nextInt();
	System.out.println("input b");
	int b =s.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(" after swapping a:"+a+",b:"+b);
	
	}
}
