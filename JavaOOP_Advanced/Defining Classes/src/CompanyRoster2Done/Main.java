package CompanyRoster2Done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Main {
//Map<String,List<Employee>> department=new HashMap<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee(null, 0, null, null);
		IntFunction<String> emplo=ignored->sc.nextLine();
		Map<String, List<Employee>> department=IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(emplo)
		.map(STRINGTOEMPLOYEE)
		.collect(Collectors.toMap(em->em.getDepartment(), 
	em->new ArrayList<Employee>(Arrays.asList(em)),(existing, replacement) -> {
		existing.add(replacement.get(0));  return existing;}));
	
		department.entrySet().stream().sorted((a, b) -> {
            double avrFirst = a.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            double avrSecond = b.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
            return Double.compare(avrSecond, avrFirst);
            
        }).limit(1).forEach(e -> {
            System.out.println(String.format("Highest Average Salary: %s", e.getKey()));
            e.getValue().stream().sorted((a,b) -> Double.compare(b.getSalary(), a.getSalary())).forEach(o -> System.out.println(String.format("%s %.2f %s %d", o.getName(), o.getSalary(), o.getEmail(), o.getAge())));
        });
		
		
	}
	private static Function<String, Employee> STRINGTOEMPLOYEE=input->{
		String[] data=input.split(" ");
		Employee e= new Employee(data[0], Double.parseDouble(data[1]),data[2], data[3]);
		switch(data.length) {
		case 4: return e;		 
		case 5:	if(data[4].contains("@")) {
			e.setEmail(data[4]); return e;
		}
		else {
			e.setAge(Integer.parseInt(data[4])); return e;
		}
		case 6: e.setEmail(data[4]); e.setAge(Integer.parseInt(data[5])); return e;
		}
		return null;
		
		
	};
	
}
