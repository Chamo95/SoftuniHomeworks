package Academy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Academy {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		List<String> list = null;
		int times=Integer.parseInt(sc.nextLine());
		Map<String,List<String>> map =new TreeMap<>();
		double sum=0;
		for(int i=0;i<times;i++) {
			String name=sc.nextLine();
			list=Arrays.asList(sc.nextLine().split(" "));
			if(!map.containsKey(name)) {
				map.put(name, list);
			}
			else {
				for(String x:list) {
					sum+=Double.parseDouble(x);
				}
				System.out.printf("%s is graduated with ",name);
				System.out.print((double)sum/list.size());
				System.out.println();
				sum=0;
			}
				
		}
		for(Entry<String,List<String>> entry :map.entrySet()) {
			for(String x:entry.getValue()) {
				sum+=Double.parseDouble(x);
			}
			System.out.printf("%s is graduated with ",entry.getKey());
			System.out.print((double)sum/entry.getValue().size());
			System.out.println();
			sum=0;
		}
	}
	
}
