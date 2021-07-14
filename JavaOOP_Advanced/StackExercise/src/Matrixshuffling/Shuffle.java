package Matrixshuffling;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		read();
		
	}
private static void read() {
	Scanner sc=new Scanner(System.in);
	String[] dimen= sc.nextLine().split(" ");
	String[][] matrix=new String[Integer.parseInt(dimen[0])][Integer.parseInt(dimen[1])];
	for(int i=0;i<matrix.length;i++) {
		matrix[i]= sc.nextLine().split(" ");
	}
	command(matrix,sc);
	
	
	
}
private static void command(String matrix[][],Scanner sc) {
	String[] input=sc.nextLine().split(" ");
	String hold;
	
	while(!input[0].equals("END")) {
		if(input.length==5) {
		int row1= Integer.parseInt(input[1]);
		int col1= Integer.parseInt(input[2]);
		int row2= Integer.parseInt(input[3]);
		int col2= Integer.parseInt(input[4]);
if(input[0].equals("swap")&&row1<matrix.length&&col1<matrix[0].length
&&row2<matrix.length&&col2<matrix[0].length) 
{
		hold=matrix[row1][col1];
		matrix[row1][col1]=matrix[row2][col2];
		matrix[row2][col2]=hold;
		
		
		for(int i=0;i<matrix.length;i++) {
			for(int y=0;y<matrix[0].length;y++) {
				if(y==matrix[0].length-1&&i==matrix.length-1) {
					System.out.print(matrix[i][y]);
				}
				else {
					System.out.print(matrix[i][y]+" ");
				}
			}
			System.out.println();
		}
}
	else {
		System.out.println("Invalid input!");
		
	}
		}
		else {
			System.out.println("Invalid input!");
			
		}
	input=sc.nextLine().split(" ");
	
	
 } //end while
	
	
	
}

}
