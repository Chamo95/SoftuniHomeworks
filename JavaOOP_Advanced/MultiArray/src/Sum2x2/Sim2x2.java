//package Sum2x2;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Sim2x2 {
//	static int  matrix[][];
//	
//	public static void main(String[] args) {
//		input();
//		biggestmatrix();
//		
//	}
//
//	private static void biggestmatrix() {
//		//int submatrix[][]=new int[2][2];
//		int row=2;
//		int column=0;
//		for(int i=0;i<row;i++) {
//			for(int y=column;column<;y++) {
//				System.out.print(matrix[i][y] + " ");
//			}
//			System.out.println();
//			column+=2;
//		}
//		
//	}
//
//	private static void input() {
//	Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine().replace(",", "");
//		 matrix=new int[Integer.parseInt(input.split(" ")[0])][Integer.parseInt(input.split(" ")[1])];
//		for(int i=0;i<matrix.length;i++) {
//			input=sc.nextLine().replace(",","");
//			for(int y=0;y<matrix[0].length;y++) {
//				matrix[i][y]= Integer.parseInt(input.split(" ")[y]);
//			}
//		}
//	}
//
//}
