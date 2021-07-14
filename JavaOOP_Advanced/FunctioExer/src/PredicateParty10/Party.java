package PredicateParty10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Party {
	static List<String> people2=new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> people=Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());;
		
		for(String x:people) {
			people2.add(x);
		}
		
	people.stream().filter(test(people,sc));
	Collections.sort(people2);
	if(people2.isEmpty()) {
		System.out.println("Nobody is going to the party!");
	}
	else {
		System.out.println(people2.toString().substring(1,people2.toString().length()-1)+" are going to the party!");
	}
	
	}
private static  Predicate<String> test(List<String> people,Scanner sc){
	String command=sc.nextLine();
	
	while(!command.equals("Party!")) {
	
		String data[]=command.split(" ");
		if(data[0].equals("Double")) {
			if(data[1].equals("StartsWith")) {
				for(String x:people) {
					if(x.startsWith(data[2])) {
						people2.add(x);				
						
					}
				}
				people=new ArrayList<String>();
				for(String x:people2) {
					people.add(x);
				}
			}	
					else if(data[1].equals("EndsWith")) {
						for(String x:people) {
							if(x.endsWith(data[2])) {
								people2.add(x);				
								
							}
						}
					}
					else if(data[1].equals("Length")) {
						int length=Integer.parseInt(data[2]);
						for(String x:people) {
							if(x.length()==length) {
								people2.add(x);				
								
							}
						}
					}
			people=new ArrayList<String>();
			for(String x:people2) {
				people.add(x);
			}
				}
	
		else if(data[0].equals("Remove")) {
			if(data[1].equals("StartsWith")) {
			for(String x:people) {
				
				if(x.startsWith(data[2])) {
					people2.remove(x);				
				
				}
				
			}
			
		}
			else if(data[1].equals("EndsWith")) {
				for(String x:people) {
					if(x.endsWith(data[2])) {
						people2.remove(x);				
					
					}
				}
				
			}
			else if(data[1].equals("Length")) {
				int length=Integer.parseInt(data[2]);
				for(String x:people) {
					if(x.length()==length) {
						people2.remove(x);				
						
					}
				}
			}
			people=new ArrayList<String>();
			for(String x:people2) {
				people.add(x);
			}
		}
	
		command=sc.nextLine();	
	}
	return pre->{return false;};
	
}
}
