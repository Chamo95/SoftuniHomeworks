package eddorevenstream;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

static int start;
static int end;
	public static void main(String[] args) {
		input();
	}

	private static void input() {
		int y=10;
		Scanner sc=new Scanner(System.in);	
		String data[]=sc.nextLine().split(" ");
		start=Integer.parseInt(data[0]); end=Integer.parseInt(data[1]);
 	IntStream.rangeClosed(start, end)
		.filter(filter(sc.nextLine())).mapToObj(i->i==end || i==end-1 ? i+"" :i+" " ).forEach(System.out::print);

 	
 	
 }
		

		
 
	public static IntPredicate filter(String x){
		if(x.equals("even")) {
			return numb->numb%2==0;
		}
		else {
			return numb->numb%2!=0;
		}
		
	}

}
