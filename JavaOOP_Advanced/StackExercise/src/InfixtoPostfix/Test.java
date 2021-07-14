package InfixtoPostfix;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;



public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack<String> stack=new Stack<String>();
	Queue<String> q=new LinkedList<String>();

	
	
	for(String x : sc.nextLine().split(" ")) {
		
		
		if(Pattern.compile("[+-/*(]").matcher(x).matches()) {
			stack.push(x);
		}
		else if(!x.equals(")")) {
			
			q.add(x);
		}
		
		while(x.equals(")") ) {
			if(stack.peek().equals("(")) { stack.pop(); break;}
			q.add(stack.pop());
		}
		
		
		
		
		
				
	}
	while(!stack.isEmpty()) {
		q.add(stack.pop());
	}
	
	System.out.println(q.toString().replace("[","").replace("]","").replace(",","")); 
	// 2 + ( 3 * ( 8 - 4 ) )
}
}
