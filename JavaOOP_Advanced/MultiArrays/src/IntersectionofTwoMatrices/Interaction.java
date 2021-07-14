package IntersectionofTwoMatrices;

import java.util.Scanner;

public class Interaction {
static char  A[][];
static char  B[][];
	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		A=new char[Integer.parseInt(sc.nextLine())][Integer.parseInt(sc.nextLine())];
		B=new char[A.length][A[0].length];
		for(int z=0;z<2;z++) {
		for(int i=0;i<A.length;i++) {
		char[] hold=sc.nextLine().replace(" ","").toCharArray();
			for(int y=0;y<A[i].length;y++) {
				if(z==0) {
					A[i][y]=hold[y];
				}
				else {
					if(A[i][y]!=hold[y]) {
						B[i][y]='*';
					}
					else {
						B[i][y]=hold[y];
					}
					
				}
			}
		}
		} //main for
		for(char c []:B) {
		for(char d:c) {
			System.out.print(d+ " ");
		}
		System.out.println();
		}
	}

	
}
