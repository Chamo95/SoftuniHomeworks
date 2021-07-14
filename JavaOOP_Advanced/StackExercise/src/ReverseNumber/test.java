package ReverseNumber;

import java.util.Scanner;
import java.util.Stack;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<String> st=new Stack<String>();
	
	while(sc.hasNext()) {
		for(String x : sc.nextLine().split(" ")) {
			st.push(x);
		}
		for(int i=st.size();0<st.size();i--) {
			if(i==1) {
				System.out.print(st.pop());
				System.out.println();
			}
			else {
				System.out.print(st.pop()+" ");
			}
	}
		
}

	}
}
