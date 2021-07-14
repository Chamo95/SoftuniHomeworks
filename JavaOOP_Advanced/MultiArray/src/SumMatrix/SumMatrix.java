package SumMatrix;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		String input=sc.nextLine().replace(",","");
		int row=Integer.parseInt(input.split(" ")[0]);
		int column=Integer.parseInt(input.split(" ")[1]);

for(int i=0;i<row;i++) {
	input=sc.nextLine().replace(",","");
	for(int y=0;y<column;y++) {
		sum+=Integer.parseInt(input.split(" ")[y]);
	}
}
System.out.println(row);
System.out.println(column);
System.out.println(sum);
	}

}
