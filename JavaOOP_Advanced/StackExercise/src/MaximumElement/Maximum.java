package MaximumElement;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<Integer>();
		
		int Ncommands= Integer.parseInt(sc.nextLine());
		String command;
		for(int i=1;i<=Ncommands;i++) {
			command=sc.nextLine();
			if(command.charAt(0)=='1') {
			String x[]=command.split(" ");
			stack.push(Integer.parseInt(x[1]));
			}
			else if(command.charAt(0)=='2') {
				
				stack.pop();
			}
			else if(command.charAt(0)=='3') {
				System.out.println(Collections.max(stack));
				}
			
		}
	}

}
