package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Stack<String> stack = new Stack<String>();
		stack.push("NY");
		stack.push("NJ");
		stack.push("FL");
		Iterator it = stack.iterator();
		while (it.hasNext()){
			System.out.println(stack.pop());


		}
	}

}
