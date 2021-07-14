package Miner6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Miner {
public static void main(String[] args) {
 input();
}

private static void input() {
	Scanner sc=new Scanner(System.in);
	LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
	String input="";
	while(!input.equals("stop")) {
		input=sc.nextLine();
		if(input.equals("stop")) {
			break;
		}
		if(map.containsKey(input)) {
			map.put(input, map.get(input)+Integer.parseInt(sc.nextLine()));
		}
		else {
		map.put(input, Integer.parseInt(sc.nextLine()) );
		}
	}
	for(Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}
}
}
