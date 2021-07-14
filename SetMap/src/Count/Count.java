package Count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Count {
 public static void main(String[] args) {
 input();
 }

private static void input() {
	Map<Double,Integer> numb = new LinkedHashMap<Double,Integer>();
	Scanner sc=new Scanner(System.in);
	Double[] numbers=Arrays.stream(sc.nextLine().split(" ")).map(Double::valueOf).toArray(Double[]::new);
	for(double x:numbers) {
		if(numb.containsKey(x)) {
			numb.replace(x, numb.get(x)+1);
		}
		else {
			numb.put(x, 1);
		}
	}
	
	numb.entrySet().forEach(entry->{
		System.out.printf("%.1f -> %d\n", entry.getKey(),entry.getValue());
	});
}
}
