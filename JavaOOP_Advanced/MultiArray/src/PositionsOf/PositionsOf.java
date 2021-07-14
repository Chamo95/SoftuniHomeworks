package PositionsOf;

import java.util.Scanner;

public class PositionsOf {
static	int arr[][];
	public static void main(String[] args) {
		input();
		
	}
public static void input() {
	Scanner sc=new Scanner(System.in);
	String input= sc.nextLine();
 arr=new int[Integer.parseInt(input.split(" ")[0])][Integer.parseInt(input.split(" ")[1])];
for(int i=0;i<arr.length;i++) {
	input=sc.nextLine();
	for(int y=0;y<arr[i].length;y++) {
		arr[i][y]= Integer.parseInt( input.split(" ")[y]);
	}
}
determine(Integer.parseInt(sc.nextLine()));
}
public static void determine(int number) {
	//Scanner sc=new Scanner(System.in);
	//int number = Integer.parseInt(sc.nextLine());
	boolean check=true;
	for(int i=0;i<arr.length;i++) {
		for(int y=0;y<arr[i].length;y++) {
			if(arr[i][y]==number) {
				System.out.println(i + " "+ y);
				check=false;
			}
		}	
	}
	if(check) System.out.println("not found");
}

}
