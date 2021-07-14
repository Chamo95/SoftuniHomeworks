package CompareMatri;

import java.util.Arrays;
import java.util.Scanner;

public class Real {
	static int a[][];
	static int b[][];
	public static void main(String[] args) {
		input();
		System.out.println(check());
	}
	public static void input() {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		 a=new int[Integer.parseInt(input.split(" ")[0])][Integer.parseInt(input.split(" ")[1])];
	
		for(int i=0;i<a.length;i++) {
			input=sc.nextLine();
			for(int y=0;y<a[0].length;y++) {
				a[i][y]= Integer.parseInt(input.split(" ")[y]);
			}	
		}
		 input=sc.nextLine();
		b=new int[Integer.parseInt(input.split(" ")[0])][Integer.parseInt(input.split(" ")[1])];
		for(int i=0;i<b.length;i++) {
			input=sc.nextLine();
			for(int y=0;y<b[0].length;y++) {
				b[i][y]= Integer.parseInt(input.split(" ")[y]);
			}	
		}
		
	}
	
	public static String check() {
		for(int i=0;i<a.length;i++) {
			Arrays.sort(a[i]);
			
		}
		for(int i=0;i<b.length;i++) {
			Arrays.sort(b[i]);
			
		}

		
		if (a.length != b.length) {	 return "not equal"; }
		
		for (int i = 0; i < a.length; i++) {
			 
			 
			if (!Arrays.equals(a[i], b[i])) {
			 
			 
			    return "not equal";
			 
			 
			}
	
	}
		return "equal";
}
}