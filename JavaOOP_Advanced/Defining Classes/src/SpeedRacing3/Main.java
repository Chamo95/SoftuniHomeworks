package SpeedRacing3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> line=ignored->sc.nextLine();
		Map<String,List<Car>> mapcars=IntStream.range(0,Integer.parseInt(sc.nextLine()))
		.mapToObj(line)
	.map(STRINGTOCAR).collect(Collectors.toMap(
	input->input.getModel(),input->new ArrayList<Car>(Arrays.asList(input)),(x, y) -> y, LinkedHashMap::new));
		
		String command=sc.nextLine();
		while(!command.equals("End")) {
			String data[]=command.split(" ");
			if(mapcars.containsKey(data[1])) {
				mapcars.get(data[1]).get(0).calculate(Integer.parseInt(data[2]));
			}
			command=sc.nextLine();
		}
		for(Entry<String, List<Car>> entry:mapcars.entrySet()) {
			System.out.println(entry.getValue().get(0));
		}
	}
	private static Function<String,Car> STRINGTOCAR=input->{
		String[] data=input.split(" ");
		return new Car(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]));
		
	};
}
