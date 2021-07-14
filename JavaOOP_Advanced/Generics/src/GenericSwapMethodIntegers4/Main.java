package GenericSwapMethodIntegers4;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
static	Box<Integer> obj=new Box<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> input=ignored->sc.nextLine();
		IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(input).map(STRING_BOX).collect(Collectors.toList());
	String data[]=sc.nextLine().split(" ");
	
	obj.swap(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
	
	}
private static Function<String,Box> STRING_BOX=input->{
	
	obj.add(Integer.parseInt(input));
	
	return obj;
	
};
}
