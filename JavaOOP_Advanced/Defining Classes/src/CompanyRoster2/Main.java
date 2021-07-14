package CompanyRoster2;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> emplo=ignored->sc.nextLine();
		IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(emplo)
		.map(STRINGTOEMPLOYEE).sorted().forEach(empolee->System.out.println(empolee.getSalary()));
		

	}
	private static Function<String, Employee> STRINGTOEMPLOYEE=input->{
		String[] data=input.split(" ");
		switch(data.length) {
		case 4:	return new Employee(data[0], Double.parseDouble(data[1]),data[2], data[3]);		 
		case 5:	return new Employee(data[0], Double.parseDouble(data[1]),data[2], data[3],data[4]);
		case 6:	return new Employee(data[0],Double.parseDouble(data[1]),data[2], data[3],data[4],Integer.parseInt(data[5]));	
		 
		}
		return null;
		
		
	};
}
