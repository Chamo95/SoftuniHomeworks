package StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Core {

	public void run() {
	
		Scanner sc=new Scanner(System.in);
		TreeSet<Person> treeByName=new TreeSet<>(new CompareByName());
		TreeSet<Person> treeByage=new TreeSet<>(new CompareByAge());
		int range=Integer.parseInt(sc.nextLine());
		for(int i=0;i<range;i++) {
			String data[]=sc.nextLine().split(" ");
			Person obj=new Person(data[0], Integer.valueOf(Integer.parseInt(data[1])));
			treeByName.add(obj);
			treeByage.add(obj);
		}
		treeByName.forEach(System.out::println);
		treeByage.forEach(System.out::println);
		
	}
}
