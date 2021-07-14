package PredicateParty10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
 List<String> list=new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
 
 	String command=sc.nextLine();
	while(!command.equals("Party!")) {
	String data[]=command.split(" ");
	 if(data[0].equals("Remove")) {
		 list.removeIf(test(data[1],data[2]));
	 }
	 else if(data[0].equals("Double")) {
		 for(int i=0;i<list.size();i++) {
			 if(test(data[1],data[2]).test(list.get(i))) {
				 list.add(i++, list.get(i-1));
			 }
		 }
		 
	 }
	 
	command=sc.nextLine();
}
	if(list.isEmpty()) {
		System.out.println("Nobody is going to the party!");
	}
	else {
	Collections.sort(list);
	System.out.println(String.format("%s are going to the party!", String.join(", ", list)));
	}
	
}
private static Predicate<String> test(String command,String var){
	switch(command) {
	case "StartsWith":return name->name.startsWith(var);
	case "EndsWith":return name->name.endsWith(var);
	case "Length":return name->name.length()==Integer.parseInt(var);
	}
	return name->false;
}
	
}
