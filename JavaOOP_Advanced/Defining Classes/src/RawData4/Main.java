package RawData4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		List<Car> cars=IntStream.range(0, Integer.parseInt(sc.nextLine()))
		.mapToObj(line)
		.map(STRINGTOCAR).collect(Collectors.toList());
		String command=sc.nextLine();
		cars.stream().filter(car->car.getCargo().getCargoType().equals(command)
		&& 
		car.getTires().stream().anyMatch(tyre->tyre.getTirePressure()<1)||car.getCargo().getCargoType().equals(command)
		&& car.getEngine().getEnginePower()>250
		).forEach(car->System.out.println(car.getModel()));
		
	}
	private static Function<String,Car> STRINGTOCAR=input->{
		
		String data[]=input.split(" ");
String model=data[0]; int EngineSpeed=Integer.parseInt(data[1]); int EnginePower=Integer.parseInt(data[2]);
int CargoWeight= Integer.parseInt(data[3]); String CargoType=data[4];
double Tire1Pressure=Double.parseDouble(data[5]); int Tire1Age=Integer.parseInt(data[6]);
double Tire2Pressure=Double.parseDouble(data[7]); int Tire2Age=Integer.parseInt(data[8]);
double Tire3Pressure=Double.parseDouble(data[9]); int Tire3Age=Integer.parseInt(data[10]);
double Tire4Pressure=Double.parseDouble(data[11]); int Tire4Age=Integer.parseInt(data[12]);
List<Tire> list=new ArrayList<>();
list.add(new Tire(Tire1Pressure,Tire1Age));
list.add(new Tire(Tire2Pressure,Tire2Age));
list.add(new Tire(Tire3Pressure,Tire3Age));
list.add(new Tire(Tire4Pressure,Tire4Age));

return new Car(data[0], 
new Engine(EngineSpeed,EnginePower), 
new Cargo(CargoWeight, CargoType),
list);
		
		
	};
}
