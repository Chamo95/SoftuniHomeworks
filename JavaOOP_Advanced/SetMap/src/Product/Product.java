package Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Product {
 public static void main(String[] args) {
 input();
}

private static void input() {
	Scanner sc=new Scanner(System.in);
	String line=sc.nextLine();
	TreeMap<String,Map<String,Double>> map=new TreeMap<>();
	while(!line.equals("Revision"))
	{
	  String[] info=line.replace(",","").split(" ");
	  String company= info[0];  String product= info[1]; Double price= Double.parseDouble(info[2]);
	  if(!map.containsKey(company)) {
		  map.put(company, new LinkedHashMap<String, Double>());
	  }
	 map.get(company).put(product, price);
	  line=sc.nextLine();
	}
	for(Entry<String, Map<String, Double>> entry : map.entrySet()) {
		System.out.println(entry.getKey()+"->");
		for(Entry<String, Double> entry2 : entry.getValue().entrySet())
		System.out.printf(Locale.US,"Product: %s, Price: %.1f\n",entry2.getKey(),entry2.getValue());
	}
}
 
}
