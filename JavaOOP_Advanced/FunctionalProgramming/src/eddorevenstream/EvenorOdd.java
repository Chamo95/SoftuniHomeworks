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

public class EvenorOdd {

static int start;
static int end;
	public static void main(String[] args) {
		input();
	}

	private static void input() {
		Scanner sc=new Scanner(System.in);	
		String data[]=sc.nextLine().split(" ");
		start=Integer.parseInt(data[0]); end=Integer.parseInt(data[1]);
 List<Integer> list=	IntStream.rangeClosed(start, end)
			.filter(filter(sc.nextLine())).boxed().collect(Collectors.toList());
 for(int i=0;i<list.size();i++) {
	 if(i==list.size()-1) {
		 System.out.print(list.get(i));
	 }
	 else {
		 System.out.print(list.get(i)+" ");
		 
	 }
 }
		

		
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
