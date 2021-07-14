package SimpleTextEditor;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
static StringBuilder sb=new StringBuilder();

static Deque<String> history=new ArrayDeque<String>();
	public static void main(String[] args) {
		sb.append("");
		history.push(sb.toString());
		readInput();

	}
	static void readInput() {
		Scanner sc = new Scanner(System.in);
		int number_of_commands=Integer.parseInt(sc.nextLine());
		for(int i=0;i< number_of_commands;i++) {
		String input= sc.nextLine();
		String  command = input.split(" ")[0];
        switch(command) {
   case "1" :    
	history.push(sb.toString());
   sb.append(input.substring(2));
   
   break;
   case "2" :    
   history.push(sb.toString());
   sb.setLength(sb.length()-Integer.parseInt(input.split(" ")[1]));
   break;
  case "3" : System.out.println(sb.charAt(Integer.parseInt(input.split(" ")[1])-1));     break;
  case "4" :   sb = new StringBuilder(history.pop());	break;
        }
			
			
		}
			
	}
}
