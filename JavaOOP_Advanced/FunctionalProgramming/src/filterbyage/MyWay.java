//package filterbyage;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class MyWay {
//	static int age;
//	public static void main(String[] args) {
//		input();
//
//	}
//
//	private static void input() {
//		Scanner sc=new Scanner(System.in);
//		List <Person> people=new ArrayList<Person>();
//		
//		int times = Integer.parseInt(sc.nextLine()); 
//		for(int i=0;i<times;i++) {
//		String data[]=sc.nextLine().split(", ");
//		people.add(new Person(data[0],Integer.parseInt(data[1])));
//		}
//	    Person.way=sc.nextLine();
//		//Collections.sort(people);
//		 age=Integer.parseInt(sc.nextLine());
//		 Person.format=sc.nextLine();
//		 if( Person.way.equals("younger")) {
//		people.stream().filter(p->p.getAge()<=age)
//		.forEach(p->p.display());}
//		 else {
//			 people.stream().filter(p->p.getAge()>=age)
//				.forEach(p->p.display());}
//		 }
//		
//	}
// class Person implements Comparable<Person>{
//private String name;
//private int age;
//public static String way;
//public static String format;
//
//
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
//public void display() {
//	switch(format) {
//	case "name" :  System.out.println(this.getName()); break; 
//	case "age":  System.out.println(this.getAge()); break;
//	case "name age" : System.out.println(this.getName()+" - "+this.getAge());
//	
//	}
//}
//public Person() {
//	
//}
//public Person(String name) {
//	super();
//	this.name = name;
//}
//
//public Person(String name, int age) {
//	super();
//	this.name = name;
//	this.age = age;
//}
//
//public String getName() {
//	return name;
//}
//
//@Override
//public int compareTo(Person o) {
//	if(way.equals("older")) {
//	if(this.age>o.age) {
//		return 1;
//	}
//	else {
//		return -1;
//	}
//	}
//	else {
//		if(this.age<o.age) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
//	
//}
//
//}
//
