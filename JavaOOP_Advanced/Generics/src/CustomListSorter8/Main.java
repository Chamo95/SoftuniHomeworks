package CustomListSorter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) throws IOException {
		command_interpreter(); 

	}

	private static  void command_interpreter() throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		CustomList<String> list=new CustomList<>();
		Sorter<String> sorter=new Sorter<>();
		String command=reader.readLine();
		while(!command.equals("END")) {
			String data[]=command.split(" ");
		
			switch(data[0]) {
			case "Add": list.add(data[1]); break;
			case "Remove": System.out.println(list.remove(Integer.parseInt(data[1]))); break; 
			case "Contains": System.out.println(list.contains(data[1])); break; 
			case "Swap": list.swap(Integer.parseInt(data[1]), Integer.parseInt(data[2])); break;
			case "Greater" :System.out.println(list.countGreaterThan(data[1]));	break;
			case "Max" : System.out.println(list.getMax()); 	break;
			case "Min" : System.out.println(list.getMin());	break;
			case "Print" : list.Print(); break;
			case "Sort": sorter.sort(list); break;
			}
			command=reader.readLine();
		}
	}
	
}
