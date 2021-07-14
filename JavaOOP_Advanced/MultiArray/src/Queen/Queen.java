package Queen;

import java.util.Arrays;
import java.util.Scanner;

public class Queen {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		
		String[][] board=new String[8][8];
		for(int i=0;i<board.length;i++) {
			board[i]=Arrays.stream(sc.nextLine().split(" ")).toArray(String[]::new);
		}
		for(int i=0;i<board.length;i++) {
			for(int y=0;y<board[i].length;y++) {
				if(board[i][y].equals("q")) {
					
					if(check(y,i,board)) {
						System.out.println(i+" "+y);
					}
				}
			}
		}
	}
	private static boolean check(int element,int row,String[][] board) {
		for(int i=element+1;i<board[row].length;i++) { //horizontal right
			if(board[row][i].equals("q")) {
				return false;
				
			}
		}
		
		for(int i=element-1;i>=0;i--) { //horizontal left
			if(board[row][i].equals("q")) {
				return false;
			}
		}
		
		
		for(int i=row+1;i<board.length;i++) {  //vertical down
			if(board[i][element].equals("q")) {
				return false;
			}
		}
		for(int i=row-1;i>=0;i--) {  //vertical up
			if(board[i][element].equals("q")) {
				return false;
			}
		}
		
		for(int c=element-1,r=row-1;c>=0&&r>=0;c--,r--) { //upleftdiagno
			if(board[row][c].equals("q")) {
				return false;
			}
			
		}
		
		
		for(int c=element+1,r=row-1;c<board[0].length&&r>=0;c++,r--) { //uprighthorizonal
			if(board[r][c].equals("q")) {
				return false;
			}
			
		}
		for(int c=element-1,r=row+1;c>=0&&r<board.length;c--,r++) { //downlefthorizonal
			if(board[r][c].equals("q")) {
				return false;
			}
			
		}
		for(int c=element+1,r=row+1;c<board[0].length&&r<board.length;c++,r++) { //downrighthorizonal
			if(board[r][c].equals("q")) {
				return false;
			}
			
		}
		return true;
		
	}
	
}
