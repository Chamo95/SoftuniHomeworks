package Cities;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
public class Cities {

	public static void main(String[] args) {
		input();
	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		int times= Integer.parseInt(sc.nextLine());
		Map<String,Map<String,List<String>>> map=new LinkedHashMap<>();
		for(int i=0;i<times;i++) {
			String[] line =sc.nextLine().split(" ");
	String continent=line[0]; String country=line[1]; String city=line[2];
			if(!map.containsKey(continent)) {
				map.put(continent, new LinkedHashMap<>());
			}
			if(!map.get(continent).containsKey(country)) {
			map.get(continent).put(country, new ArrayList<String>());
			}
			map.get(continent).get(country).add(city);
		}
		
	 for(Entry<String, Map<String, List<String>>> entry1 : map.entrySet() ) {
		 System.out.println(entry1.getKey().concat(":"));
		 for(Entry<String, List<String>> entry2 : entry1.getValue().entrySet()) {
			System.out.println(entry2.getKey()+" -> "+entry2.getValue().toString().replace("[", "").replace("]", "")); 
		 }
			 
	 }
	}

}
