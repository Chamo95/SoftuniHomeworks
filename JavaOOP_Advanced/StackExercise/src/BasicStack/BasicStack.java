package BasicStack;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class BasicStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		String x[]=sc.nextLine().split(" ");
		int N=Integer.parseInt(x[0]);
		
		for(String a:sc.nextLine().split(" ")) {
				if(N==0) {
				break;
			}
			else {
				N--;
			}
				stack.push(Integer.parseInt(a));
		}
	
		for(int i=1;i<=Integer.parseInt(x[1]);i++) {
			stack.pop();
		}
		if(stack.isEmpty()) {
			System.out.println("0");
		}
		else if(stack.contains(Integer.parseInt(x[2]))) {
			System.out.println(true);
		}
		else {
			Collections.sort(stack);
			System.out.println(stack.firstElement());
		}
	}

}
