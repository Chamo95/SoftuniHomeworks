package FindTheSmallestElement7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SmallestElement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Integer x[]=Arrays.stream(sc.nextLine().split(" "))
			.map(Integer::parseInt)
			.toArray(Integer[]::new);
	
	System.out.println(minimal.apply(x));

	}
	private static Function<Integer[], Integer> minimal=input->{
		int min=Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<input.length;i++) {
			
			if(min>=input[i]) {
				min=input[i];
				index=i;
			}
			
		}
	
		return index;
		
		
		
	};

}
