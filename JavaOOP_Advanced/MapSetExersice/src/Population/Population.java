package Population;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Population {

	public static void main(String[] args) {
		
		input();
	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
	Map<String,LinkedHashMap<String,Long>> map=new LinkedHashMap<String,LinkedHashMap<String,Long>>();
	
	Map<String,Long> country_popu=new LinkedHashMap<String, Long>();
	Map<String,Long> reverseordered_country_popu=new LinkedHashMap<String, Long>();
		String data=sc.nextLine();
		
		while(!data.equals("report")) {
			String[] arr=data.split("\\|");
			if(map.containsKey(arr[1])) {
				map.get(arr[1]).put(arr[0],Long.parseLong(arr[2]) );
				country_popu.put(arr[1], country_popu.get(arr[1])+Long.parseLong(arr[2]));
			}
			else {
map.put(arr[1], new LinkedHashMap<String, Long>(){{put(arr[0], Long.parseLong(arr[2]));}}  );
country_popu.put(arr[1], Long.parseLong(arr[2]));
			}
			data=sc.nextLine();
		}//end of while
		
country_popu.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())
).forEachOrdered(x-> reverseordered_country_popu.put(x.getKey(), x.getValue()));

for(Entry<String,Long> entry:reverseordered_country_popu.entrySet() ) {
  System.out.println(entry.getKey()+" (total population: "+entry.getValue()+")");
  
map.get(entry.getKey()).entrySet().
stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
forEachOrdered(x->System.out.println("=>"+x.getKey()+": "+x.getValue()));


	}


}
}