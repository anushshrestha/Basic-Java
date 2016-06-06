
package datastructure;

public class QuickSort {

	public static void main(String[] args) {
		int[]numbers={15,1,3,6,9,12,8,2,1};
		int length=numbers.length;
		quicksort(0,length-1,numbers);
		
		for(int i=0;i<length;i++){
			System.out.print(numbers[i]);
		}
	}
	
	static void quicksort(int low,int high, int[]numbers) {
		int i=low, j=high;
		int pivot =numbers[low+(high-low)/2];
		
		while(i<=j){
			
			//left side finding larger no
			while(numbers[i]<pivot){
				i++;
			}
			
			//right side finding smaller no
			while(numbers[j]>pivot){
				j--;
			}
			
			//it still in wrong side of pivot shift
			if(i<=j){
				int temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				i++;
				j--;
			}
		}
		//j decrease, lower partition lhs
		if(low<j)
			quicksort(low,j,numbers);
		
		//i increase, higher partition rhs
		if(i<high)
			quicksort(i,high,numbers);
	}
}