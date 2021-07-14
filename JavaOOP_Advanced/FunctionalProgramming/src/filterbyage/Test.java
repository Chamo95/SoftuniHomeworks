package filterbyage;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> scanner= ignored->sc.nextLine();
		List<Person> people=IntStream.range(0,Integer.parseInt(sc.nextLine()))
				.mapToObj(scanner)
				.map(Person.STRING_TO_PERSON_FUNCTION)
				.collect(Collectors.toList());
	
		 Predicate<Person> filter = Person.predicate(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		 people.stream().filter(filter);
		 System.out.println(people);
	}

}
class Person{
    
private String name;
private int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
public static final Function<String, Person> STRING_TO_PERSON_FUNCTION = input -> {
	String data[]=input.split(", "); String name=data[0]; int age=Integer.parseInt(data[1]);
	return new Person(name,age);
};
public static final Predicate<Person> predicate(String condition,int age){
switch(condition) {
case "younger" : return person-> person.age<=age;
case "older" : return person-> person.age>=age;
default:throw new IllegalArgumentException("Unknown condition" + condition);

}



 
 
}
}