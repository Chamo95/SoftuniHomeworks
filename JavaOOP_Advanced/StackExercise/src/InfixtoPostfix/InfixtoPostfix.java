package InfixtoPostfix;

import java.util.ArrayDeque;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class InfixtoPostfix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque<Character> de=new ArrayDeque<Character>();
		String token=sc.nextLine().replace(" ", "");
		for(int i=0;i<token.length();i++) {
			if(token.charAt(i)=='+') {
				de.add(token.charAt(i+1));
				de.add(token.charAt(i));
				i++;
			}
			else {
				de.add(token.charAt(i));
			}
			
		}
		System.out.println(de.toString());
	}

}
