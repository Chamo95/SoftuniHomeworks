package fishing12;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Legendary {

	public static void main(String[] args) {
		input();

	}
	private static void legendary(String item,TreeMap<String, Integer> item_q,TreeMap<String, Integer> junk_q) {
		System.out.println(item.concat("obtained!"));
		item_q.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
		forEach(x->System.out.println(x.getKey()+": "+x.getValue()));
		junk_q.forEach((k,v)->System.out.println(k+": "+v));
		
	}
	
	
	private static void input() {
		TreeMap<String, Integer> item_q=new TreeMap<String,Integer>();
		TreeMap<String, Integer> junk_q=new TreeMap<String,Integer>();
		item_q.put("motes", 0);
		item_q.put("shards", 0);
		item_q.put("fragments", 0);
		Scanner sc=new Scanner(System.in);
		while(true) {

String[] data=sc.nextLine().toLowerCase().split(" ");
for(int i=0;i<data.length;i++) {
	if(i%2!=0) {
		if(item_q.containsKey(data[i])) {
			item_q.put(data[i],item_q.get(data[i])+Integer.parseInt(data[i-1]));
		}
		else {
			if(junk_q.containsKey(data[i])) {
				junk_q.put(data[i],junk_q.get(data[i])+Integer.parseInt(data[i-1]));
			}
			else {
			junk_q.put(data[i],Integer.parseInt(data[i-1]));
			}
		}
	}
	if(item_q.get("motes")>=250) {
		item_q.put("motes", item_q.get("motes")-250);  
		legendary("Dragonwrath ",item_q,junk_q);
		return;
	}
	if(item_q.get("shards")>=250) {
		item_q.put("shards", item_q.get("shards")-250);  
		legendary("Shadowmourne ",item_q,junk_q);
		return;
	}
	if(item_q.get("fragments")>=250) { 
		item_q.put("fragments", item_q.get("fragments")-250); 	
		legendary("Valanyr ",item_q,junk_q);
		return;
	}
}

}
	
		
	}

}
