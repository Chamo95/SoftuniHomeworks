package SortEvenNumbers1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sort {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 List<Integer> list=new ArrayList<Integer>();
	 for(String x : sc.nextLine().split(", "))
		 list.add(Integer.parseInt(x));
	 
	list=list.stream().filter( x-> x%2==0).collect(Collectors.toList());
	System.out.println(list.toString().substring(1,list.toString().length()-1));
	list=list.stream().sorted().collect(Collectors.toList());
	System.out.println(list.toString().substring(1,list.toString().length()-1));
}
}