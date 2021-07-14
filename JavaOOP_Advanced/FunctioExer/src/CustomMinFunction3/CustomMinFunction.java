package CustomMinFunction3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	Function<String, Integer> mainFunction=StringtoInt.andThen(test);
	Arrays.stream(sc.nextLine().split(" ")).map(StringtoInt.andThen(test)).forEach(System.out::println);
	
}

public static  Function<String, Integer[]> StringtoInt=x->{
	String data[]=x.split(" ");
	int count=0;
	Integer[] y=new Integer[data.length];
	for(String a:data) {
		y[count]=Integer.parseInt(a);
		count++;
		System.out.println("Here"+count);
	}
	return y;
};


public static  Function<Integer[], Integer> test=x->{
	Integer min=Integer.MAX_VALUE;
	for(Integer a:x) {
		if(a<min) {
			min=a;
		}
	}
	return min;
	
};
}
