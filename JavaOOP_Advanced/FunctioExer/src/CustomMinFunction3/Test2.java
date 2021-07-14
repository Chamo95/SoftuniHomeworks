package CustomMinFunction3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
Integer x[]=Arrays.stream(sc.nextLine().split(" "))
.map(Integer::parseInt).toArray(Integer[]::new);
System.out.println(getMin.apply(x));
	}
public static Function<Integer[], Integer> getMin=Arr->{
	Integer min=Integer.MAX_VALUE;
	for(Integer x:Arr) {
		if(min>x) {
			min=x;
		}
	}
	return min;
	
};
}
