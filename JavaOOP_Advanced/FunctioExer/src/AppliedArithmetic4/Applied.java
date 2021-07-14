package AppliedArithmetic4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Applied {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		String command=sc.nextLine();
		while(!command.equals("end")) {
		switch(command) {
		case "add" : 	list=list.stream().map(input->input+1).collect(Collectors.toList());  break;
		case "subtract" : 	list=list.stream().map(input->input-1).collect(Collectors.toList());  break;
		case "multiply" : 	list=list.stream().map(input->input*2).collect(Collectors.toList()); break;
		case "print" :  System.out.println(list.toString().substring(1,list.toString().length()-1).replaceAll(",", "")); break;
		
		
		
		}
		command=sc.nextLine();
		}

	}
 
}
