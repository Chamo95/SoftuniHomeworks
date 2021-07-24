package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Core {
	public void input() {
		Scanner sc=new Scanner(System.in);
		List<Person> people=new ArrayList<Person>();
		int equal=0;
		int notequal=0;
		while(true) {
			String[] data=sc.nextLine().split(" ");
			if(data[0].equals("END")) {
				break;
			}
	people.add(new Person(data[0],Integer.parseInt(data[1]),data[2]));
		}
		int index=Integer.parseInt(sc.nextLine())-1;
		for(Person p:people) {
			if(p.compareTo(people.get(index))==0) {
				equal++;
			}
			else {
				notequal++;
			}
		}
		if(equal!=1) {
		System.out.printf("%d %d %d",equal,notequal,people.size());
		}
		else {
			System.out.println("No matches");
		}
	}
	
}
