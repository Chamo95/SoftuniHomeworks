package ThePartyReservationFilterModule11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;



public class Filter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> people=new ArrayList<String>(Arrays.asList(sc.nextLine().split(" "))); 
		List<String> filters=new ArrayList<String>();
		String filter=sc.nextLine();
		while(!filter.equals("Print")) {
			if(filter.split(" ")[0].equals("Remove")) {
				filters.remove(filter.replaceFirst("Remove", "Add"));
			}
			else {
				filters.add(filter);
			}
			filter=sc.nextLine();
		}
		for(int i=0;i<filters.size();i++) {
			String data[]=filters.get(i).split(";");
			people.removeIf(test(data[1],data[2]));
		}
		System.out.println(String.format("%s", String.join(" ", people)));
	}
private static Predicate<String> test(String command,String var){
	switch (command) {
	case "Starts with": return name->name.startsWith(var);
	case "Ends with": return name->name.endsWith(var);
	case "Length": return name->name.length()==Integer.parseInt(var); 
	case "Contains": return name->name.contains(var);
	default: return name->false;
	}
	
	
}
}
