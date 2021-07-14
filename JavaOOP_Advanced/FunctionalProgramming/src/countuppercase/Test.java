package countuppercase;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Predicate<String> pre=e-> Character.isUpperCase(e.charAt(0)) ;
	List<String> list= 
Arrays.asList(sc.nextLine().split(" ")).stream().filter(pre).collect(Collectors.toList());
		
	System.out.println(list.size());
		list.forEach(System.out::println);

	}

}
