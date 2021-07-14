package CustomComparator8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomComparator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.stream(sc.nextLine().split(" "))
		.map(Integer::parseInt)
		.collect(Collectors.toList());
		
		List<Integer> sortedeven= list.stream()
				.filter(x->x%2==0)
				.sorted(compara())
				.collect(Collectors.toList());
		
		List<Integer> sortedodd= list.stream()
				.filter(x->x%2!=0)
				.sorted(compara())
				.collect(Collectors.toList());
		sortedeven.addAll(sortedodd);
System.out.println(sortedeven.toString().substring(1, sortedeven.toString().length()-1).replaceAll(",", ""));
		
	}
	
	private static Comparator<Integer> compara(){
		
		return (x,y)-> {
			
			
				if(x>y) {
					
					return 1;
				}
				else if(x<y) {
					return -1;
				}
				else {
					return 0;
				}	
		};
		
	}
}
