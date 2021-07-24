package EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Core {
	public void run() {
		Scanner sc=new Scanner(System.in);
		TreeSet<Person> treeset=new TreeSet<>(new PersonComparator());
		HashSet<Person> hashset=new HashSet<>();
		int range=Integer.parseInt(sc.nextLine());
		for(int i=0;i<range;i++) {
			String data[]=sc.nextLine().split(" ");
			Person obj=new Person(data[0], Integer.parseInt(data[1]));
			treeset.add(obj);
			hashset.add(obj);
		}
		System.out.println(treeset.size());
		System.out.println(hashset.size());
	}
}
