package Tuple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String data[]=sc.nextLine().split(" ");
		Tuple<String,String> obj=new Tuple<String,String>(data[0].concat(" "+data[1]),data[2]);
		
		data=sc.nextLine().split(" ");
		 Tuple<String,Integer> obj1=new Tuple<String,Integer>(data[0],Integer.parseInt(data[1]));
		
		 data=sc.nextLine().split(" ");
		 Tuple<Integer,Double> obj2=new Tuple<Integer,Double>(Integer.parseInt(data[0]),Double.parseDouble(data[1]));
		 System.out.println(obj);
		 System.out.println(obj1);
		 System.out.println(obj2);
	}

}
