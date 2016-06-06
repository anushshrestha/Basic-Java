package datastructure;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int s) {
		// TODO Auto-generated constructor stub
		maxSize=s;
		stackArray= new long[maxSize];
		top=-1;
	}
	
	public void push(long j) {
		stackArray[++top]=j;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	public long peek() {
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull() {
		return (top==maxSize-1);
	}
	public static void main(String[] args) {
		Stack s= new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);	
		while(!s.isEmpty()){
			long value= s.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
