package OpinionPoll1;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> map=ignored->sc.nextLine();
		IntStream.range(0, Integer.parseInt(sc.nextLine())).
		mapToObj(map)
		.map(STRINGTOPERSON)
		.filter(person->person.getAge()>30)
		.sorted()
		.forEach(person->System.out.println(String.format("%s - %d", person.getName(),person.getAge() )));
		
	}
private static Function<String,Person> STRINGTOPERSON=input->{
	String data[]=input.split(" ");
	
return new Person(data[0],Integer.parseInt(data[1]));
	
};
}
