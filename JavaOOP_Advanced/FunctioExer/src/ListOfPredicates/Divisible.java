package ListOfPredicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=Integer.parseInt(sc.nextLine());
		List<Integer> list =Arrays.asList(sc.nextLine().split(" "))
				.stream().map(Integer::parseInt).collect(Collectors.toList());
	List<Integer> list2=IntStream.rangeClosed(1, number).filter(test(list)).boxed().collect(Collectors.toList());
		System.out.println(list2.toString().substring(1,list2.toString().length()-1).replaceAll(",", ""));
	}
	private static IntPredicate test(List<Integer> list)  {
		
		return x-> {
			for(Integer a:list) {
				if(x%a!=0) {
					return false;
				}
			}
			return true;
			};
		
			
	}
	
	
}
