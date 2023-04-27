package collection_framework;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> stack1=new Stack<>();
stack1.push(1);
stack1.push(12);
stack1.push(13);
stack1.push(14);
stack1.push(15);
System.out.println("Elements is added on stack: " +stack1);
stack1.pop();
System.out.println("Elements is deleted at the end of stack: " +stack1);
System.out.println("peek :- " + stack1.peek());
System.out.println("peek :- " + stack1);
	}

}
