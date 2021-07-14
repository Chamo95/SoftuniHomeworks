package aggregator11;

import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		TreeMap<String,Integer> user_time =new TreeMap<String,Integer>();
		TreeMap<String,TreeSet<String>> user_ip =new TreeMap<String,TreeSet<String>>();
		int times=Integer.parseInt(sc.nextLine());
		for(int i=0;i<times;i++) {
		String data[]=sc.nextLine().split(" ");
		String ip=data[0]; String name=data[1]; int time=Integer.parseInt(data[2]);
		if(user_time.containsKey(name)) {
			user_time.put(name,user_time.get(name)+time);
			TreeSet<String> set=user_ip.get(name);
			set.add(ip);
			user_ip.put(ip, set);
		}
		else {
			user_time.put(name, time);
			user_ip.put(name, new TreeSet<String>(){{add(ip);}} );
		}
		}
		for(Entry<String,Integer> entry : user_time.entrySet() ) {
	System.out.println(entry.getKey()+": "+entry.getValue()+" "+user_ip.get(entry.getKey()));
		}
	}

}
