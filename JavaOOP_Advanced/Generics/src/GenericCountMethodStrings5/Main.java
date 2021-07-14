package GenericCountMethodStrings5;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> input=ignored->sc.nextLine();
	List<String> boxes=IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(input).map(STRING_BOX).collect(Collectors.toList());
	Box boxToCompare =new Box(sc.nextLine());
	System.out.println(countGreater(boxes,String.valueOf(boxToCompare)));
	}
private static Function<String,String> STRING_BOX=input->{
	
	Box obj=new Box(input);
	
	return String.valueOf(obj);
	
};
public static <T extends Comparable<T>> int countGreater(List<T> list, T element) {
    int counter= 0;
    for (int i = 0; i < list.size(); i++) {
        if (element.compareTo(list.get(i)) < 0) {
            counter++;
        }
    }
    return counter;
}
}

