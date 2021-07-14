package GenericCountMethodDoubles6;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> input= ignored->sc.nextLine();
		List<Double> boxes=IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(input).map(STRING_BOX).collect(Collectors.toList());
		Boxes compareto=new Boxes<>(sc.nextLine());
		
		System.out.println(CompareDouble(boxes, Double.valueOf(String.valueOf(compareto))));

	}
private static Function<String, Double> STRING_BOX=input->{
	Boxes box=new Boxes(input);
	return Double.valueOf(String.valueOf(box));
	
};
private static <T extends Comparable<T>> int CompareDouble(List<T> list,T element){
	int count=0;
	for(T x:list) {
		if(element.compareTo(x)<0) {
			count++;
		}
	}
	return count;
	
}
}
