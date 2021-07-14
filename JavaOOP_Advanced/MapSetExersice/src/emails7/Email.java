package emails7;

import java.util.Scanner;

public class Email {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		input();
		
		long stopTime = System.nanoTime();
		long duration=(stopTime - startTime)/1000000;
		System.out.println(duration);
	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String name=sc.nextLine();
			if(name.equals("stop")) {break;}
			String email=sc.nextLine();
			String check=email.substring(email.lastIndexOf('.')).toLowerCase();
			//System.out.println(check);
			if(!check.equals(".uk")&&!check.equals(".us")&&!check.equals(".com")) {
				System.out.println(name+" -> "+email);
			}
		}
	}

}
