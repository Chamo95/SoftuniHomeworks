package sumnumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		List<String> list=Arrays.asList(sc.nextLine().split(", "));
		for(String x:list) {
			
			Function<String, Integer> func=Integer::parseInt;
			sum+= func.apply(x);
		}
		String status=String.format("Count = %d\nSum = %d", list.size(),sum);
		System.out.println(status);
	}

}
