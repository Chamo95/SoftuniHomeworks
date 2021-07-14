package CarSalesman5;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction<String> line=ignored->sc.nextLine();
		Map<Object, Engine> engines=IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(line).map(STRINGTOENGINE)
		.collect(Collectors.toMap(engine->engine.getModel(),engine->engine));
		
		IntFunction<String> carline=ignored->sc.nextLine();
		IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(carline).map(STRINGTOCAR(engines)).forEach(System.out::print);
		
	}
	private static Function<String,Engine> STRINGTOENGINE=input->{
		String data[]=input.split(" ");
		Engine engine=new Engine(data[0],data[1]);
		switch (data.length) {
		case 3: { if(data[2].matches("\\d+")) {
			engine.setDisplacement(data[2]); break;
			}
		else {
			engine.setEfficiency(data[2]);  break;
		}
		}
		case 4: {
			engine.setDisplacement(data[2]); engine.setEfficiency(data[3]);
		}
		
	}
	return engine;
};
private static Function<String,Car> STRINGTOCAR(Map<Object, Engine> engines){
	return input->{
		String data[]=input.split(" ");
		Car car=new Car(data[0],engines.get(data[1]));
		switch (data.length) {
		case 3: { if(data[2].matches("\\d+")) {
			car.setWeight(data[2]); break;
		}
		else {
			car.setColor(data[2]); break;
		}
		}
		case 4: {
			car.setWeight(data[2]);  car.setColor(data[3]); break;
		}
		
		
	}
		return car;
};
}
}