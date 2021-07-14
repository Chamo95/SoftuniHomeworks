package Count4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Count {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> map=new TreeMap<>();
		
		char[] c=sc.nextLine().toCharArray();
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i])) {
				map.replace(c[i], map.get(c[i])+1);
			}
			else {
				map.put(c[i], 1);
			}
		}
		for(Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue() + " time/s");
		}
	}
	
	

}
