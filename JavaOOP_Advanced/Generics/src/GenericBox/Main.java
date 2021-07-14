package GenericBox;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> input=ignored->sc.nextLine();
		IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(input).map(STRING_BOX).forEach(System.out::println);
		

	}
private static Function<String,Box> STRING_BOX=input->{
	Box<Integer> obj=new Box<>(Integer.parseInt(input));

	return obj;
	
};
}
