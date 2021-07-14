package Phone5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone {
 public static void main(String[] args) {
	 search();
}

private static void search() {
	Scanner sc=new Scanner(System.in);
	Map<String,String> map=new HashMap<>();
	String entry=sc.nextLine();
	while(!entry.equals("search")) {
		String name=entry.split("-")[0];
		String phone=entry.split("-")[1];
		map.put(name, phone);
		 entry=sc.nextLine();
	}
	find(map,sc);
}

private static void find(Map<String,String> map,Scanner sc) {
	String person=sc.nextLine();
	while(!person.equals("stop")) {
		if(map.get(person)!=null) {
			System.out.println(person +" -> "+map.get(person));
		}
		else {
			System.out.printf("Contact %s does not exist.\n",person);
		}
		person=sc.nextLine();
	}//while
	 
	}
}
