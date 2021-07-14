//package CompareMatri;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class CompareMatri {
//	static ArrayList<Integer[][]> al=new ArrayList<>();
//	public  static void main(String[] args) {
//	 readInput();
//	 System.out.println(check());
//	}
//	
//	public  static void readInput() {
//		Scanner sc=new Scanner(System.in);
//		
//		while(sc.hasNext()) {		
//		String	input=sc.nextLine();
//Integer[][] multiarr=new Integer[Integer.parseInt(input.split(" ")[0])][Integer.parseInt(input.split(" ")[1])];
//
//for(int i=0;i<multiarr.length;i++) {
//	input=sc.nextLine();
//	for(int y=0;y<multiarr[i].length;y++) {
//		multiarr[i][y]= Integer.parseInt(input.split(" ")[y]);
//		//System.out.print(multiarr[i][y]);
//	}
//	//System.out.println();
//} //end of for 2
//
//al.add(multiarr);
//
//		}//end of while
//		
//	}
//	
//public static boolean check() {
//	for(int i=0;i<al.size();i++) {
//		for(int y=i+1;y<=al.size()-1;y++) {
//		
//			Collections.sort(al);
//			return Arrays.equals(al.get(i), al.get(y));
//		}
//		
//	}
//	
//	return false;
//}
//	
//}
