package DiagnoMatrix;

import java.util.Scanner;

public class DiagnoMatrix {

	public static void main(String[] args) {
		input();

	}
 private static void input() {
	 Scanner sc=new Scanner(System.in);
	 int row_column= Integer.parseInt(sc.nextLine());
	 int diagonal1[]=new int[row_column];
	 int diagonal2[]=new int[row_column];
	 int check=row_column-1;
	 for(int i=0;i<row_column;i++) {
		 String input= sc.nextLine();
		 for(int y=0;y<row_column;y++) {
			 if(i==y) {
				 diagonal1[i]=Integer.parseInt(input.split(" ")[y]);
				 }
			  if(check==y) {
				 diagonal2[i]=Integer.parseInt(input.split(" ")[y]);
				 check--;
			 }
		 } 
	 }
	 for(int i=0;i<diagonal1.length;i++) {
		 if(diagonal1.length-1==i) {
			 System.out.print(diagonal1[i]);
		 }
		 else {
			 System.out.print(diagonal1[i] +" ");
		 }
		
	 }
	 System.out.println();
	 for(int i=diagonal2.length-1;0<=i;i--) {
		 if(i==0) {
			 System.out.print(diagonal2[i]);
		 }
		 else {
			 System.out.print(diagonal2[i]+" ");
		 }
		
	 }
 }
}
