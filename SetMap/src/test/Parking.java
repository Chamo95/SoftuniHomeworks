package test;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class Parking {

	public static void main(String[] args) {
		input();
	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		Set<String> park=new LinkedHashSet();
		
		String line=sc.nextLine();
		
		while(!line.equals("END")) {
			String data[]= line.replace(",","").split(" ");
			if("OUT".equals(data[0])&&park.contains(data[1])) {
				
				park.remove(data[1]);
				
			}
			else if("IN".equals(data[0])) {
				park.add(data[1]);
			}
			line=sc.nextLine();
		}
		if(park.isEmpty()) {
			System.out.println("Parking Lot is Empty");
		}
		else {
		Iterator<String> it= park.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

}
