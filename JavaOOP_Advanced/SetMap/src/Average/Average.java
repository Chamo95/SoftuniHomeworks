package Average;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;


public class Average {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		TreeMap<String, ArrayList<Double>> map=new TreeMap<String, ArrayList<Double>>();
		int number_student=Integer.parseInt(sc.nextLine());
		double average=0;
		for(int i=0;i<number_student;i++) {
		String data[]=sc.nextLine().split(" ");
		if(map.get(data[0])==null) {
			map.put(data[0], new ArrayList<Double>());
		}
		map.get(data[0]).add(Double.parseDouble(data[1]));
		
		
		}
	  for(java.util.Map.Entry<String, ArrayList<Double>> set :map.entrySet()) {
		  System.out.print(set.getKey()+" -> ");
		  for(Double x:set.getValue()) {
			  average+=x;
			 System.out.printf(Locale.US,"%.2f ",x);
		  }
		 
		  System.out.printf(Locale.US,"(avg: %.2f)\n",average/set.getValue().size());
		  average=0;
	  }
	}

}
