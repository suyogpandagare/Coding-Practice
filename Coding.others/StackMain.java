package study.coding.others;

public class StackMain {

	public static void main(String[] args) {

		Stack st = new Stack(5);
		st.push(12);
		st.push(4);
		st.push(22);
		st.push(34);
		st.pop();
		st.pop();
		st.printStack();
		System.out.println("---------------------------    ");
		int res = st.peek();
		if(res == 0) System.out.println("Stack Underflow");
		else
			System.out.println("Peeked elememnt is = "+res);
	}

}

class Stack{
	
	private int arr[];
	private int top;
	
	Stack(int size)
	{
		this.arr = new int [size];
		this.top = -1;
	}
	
	public void printStack()
	{
		System.out.println("Printing Stack =>");
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	

	public void push(int i)
	{
		if(top >= arr.length-1) {
			System.out.println("Stack OverFlow");
		}
		else
		{
			top++;
			arr[top] = i;
		}
	}
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int p = arr[top];
			top--;
			return p;
		}
	}
	
	public int peek()
	{
		if(top == -1)
		{
			return 0;
			
		}
		else
		{
			return arr[top];
		}
		
	}
}







