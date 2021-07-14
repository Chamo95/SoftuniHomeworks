package WrongMeasure;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasure {
 public static void main(String[] args) {
	 reading();
	 
}

 private static void replace(int wr_value,int matrix[][],int row,int column,int copy[][]) {
	 int sum=0;
	 if(row!=0 &&wr_value!=matrix[row-1][column]) {   //up
		 sum+=matrix[row-1][column];
	 }
	  if(row!=matrix.length-1 &&wr_value!=matrix[row+1][column]) { //down
		 sum+=matrix[row+1][column];
	 }
	 
	 if(column!=0&&wr_value!=matrix[row][column-1]) { //left
		 sum+=matrix[row][column-1];
	 }
	  if(column!=matrix[row].length-1&&wr_value!=matrix[row][column+1]) {
		 sum+=matrix[row][column+1];
	 }
	  copy[row][column]=sum;
	  
 }
private static void reading() {
	Scanner sc=new Scanner(System.in);
	int row_column = Integer.parseInt(sc.nextLine());
	int matrix[][]=new int[row_column][row_column];
	
	for(int i=0;i<matrix.length;i++) {
matrix[i]=Arrays.stream(sc.nextLine().split(" ")).
mapToInt(Integer::parseInt).toArray();

	}
	int[][] copy = Arrays.stream(matrix).map(x -> x.clone()).toArray(int[][]::new);	
	String[] wrong_value= sc.nextLine().split(" ");
	int r=Integer.parseInt(wrong_value[0]);
	int c=Integer.parseInt(wrong_value[1]);
	int wr_value=matrix[r][c];
	
	//maybe
	for(int i=0;i<matrix.length;i++) {
		for(int y=0;y<matrix[i].length;y++) {
			if(matrix[i][y]==wr_value) {
				replace(wr_value,matrix.clone(),i,y,copy);
				
			}
		}
	}
	
	for(int x[]:copy) {
		for(int a:x) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
}
