package Threeuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String data1;
		String data2;
		String data3 ;
		List<Threeuple> list=new ArrayList<Threeuple>();
		String data[]=sc.nextLine().split(" ");
		data1=data[0].concat(" ").concat(data[1]);
		data2=data[2];
		data3=data[3];
		list.add(new Threeuple(data1, data2, data3) );
		 data=sc.nextLine().split(" ");
		 data1=data[0];
			data2=data[1];
			if(data[2].equals("drunk")) {
				data3="true";
			}
			else {
				data3="false";
			}
		list.add(new Threeuple(data1, data2, data3));
		 data=sc.nextLine().split(" ");
		 data1=data[0];
			data2=data[1];
			data3=data[2];
		list.add(new Threeuple(data1,Double.parseDouble(data2), data3));
		for(Threeuple x:list) {
			System.out.println(x);
		}
	
	}
}
