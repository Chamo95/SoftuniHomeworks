package StringMatrixRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
	static int  check=0;
	public static void main(String[] args) {
		read();
	}
 private static void read() {
	 Scanner sc=new Scanner(System.in);
	 String input=sc.nextLine().replaceAll("\\D+", "");
	 int degree= Integer.parseInt(input);
	 ArrayList<String> al=new ArrayList<>();
	 int column=0;
	
	 while(!sc.hasNext("END")) {
		 input=sc.nextLine();
		 al.add(input);
		if(column<input.length()) {
			column=input.length();
		}
	 }
	 char[][] matrix=new char[al.size()][column];
	for(int i=0;i<matrix.length;i++) {
		while(al.get(i).length()<column) {
		al.set(i, al.get(i).concat(" "));
		}
		
		matrix[i]=al.get(i).toCharArray();
	}
	
	rotate(degree,matrix);
 }
 private static void rotate(int degree,char matrix[][]) {
	
	  char mrota[][]=new char[matrix[0].length][matrix.length];
	  
	 
	 int move=0;
		 for(int y=0;y<matrix[0].length;y++) {
			 for(int i=matrix.length-1;i>=0;i--) {
				 mrota[y][move]= matrix[i][y];			 
				 move++;		
	 }
			 move=0;			
 }
	
	 while(degree/90>=2) {
		
		 degree-=90;
		 rotate( degree,mrota);
	 }
	 check++;

	if(check==1) {
 for(int i=0;i<mrota.length;i++) {
	 for(int y=0;y<mrota[i].length;y++) {
		 System.out.print(mrota[i][y]);
	 } 
	
	 System.out.println();
 }
 }

 
 
 }
}
