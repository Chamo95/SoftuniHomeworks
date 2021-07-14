package CustomMinFunction3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Test {
	static Integer y[];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Arrays.asList(sc.nextLine()).stream().map(StringtoIntArr.andThen(Int)).forEach(System.out::println);
	
}
	public static Function<String, Integer[]> StringtoIntArr=x->{
		String data[]=x.split(" ");
		y=new Integer[data.length];
		int counter=0;
		for(String e:data) {
			y[counter] =Integer.parseInt(e);
			counter++;
		}
		return y;
	};
	
	public static Function<Integer[], Integer> Int=x->{
	Integer min=Integer.MAX_VALUE;
	for(Integer a:x) {
		if(min>a) {
			min=a;
		}
	}
	return min;
	};
}
