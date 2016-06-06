package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Primefactorization {
	
	public static List<Integer> primefactors(int number) {
		
		int n = number;
		List<Integer> primefactors = new ArrayList<Integer>();
		
		for(int i=2;i<=n;i++){
			while(n%i==0){
				//for first time any no that divides is always prime
				//if(!(primefactors.contains(i)))
				primefactors.add(i);
				//now the quotient limits the boundary of loop..
				n/=i;
			}		
		}
		return primefactors;	
	}
	
	public static void main(String[] args) {
		System.out.println("Primefactors of 8");
		for(Integer integer: primefactors(8) ){
			System.out.println(integer);
		}
		
		System.out.println("Primefactors of 3");
		  for (Integer integer : primefactors(3)) {
		     System.out.println(integer);
		    }
	}
	
	
}
