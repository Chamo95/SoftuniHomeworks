package LinkedListTraversal9;

import java.util.Scanner;

public class Core {
 public void run() {
	 CustomLinkedList<Integer> list=new CustomLinkedList<Integer>();
	 Scanner sc=new Scanner(System.in);
	 StringBuilder sb=new StringBuilder();
	 int times=Integer.parseInt(sc.nextLine());
	 for(int i=0;i<times;i++) {
	 String data[]=sc.nextLine().split(" ");
	 switch(data[0]) {
	 case "Add" : {
		 list.add(Integer.parseInt(data[1]));
		 break;
	 }
	 case "Remove" :{
		 list.remove(Integer.parseInt(data[1]));
		 break;
	 			}
	 		}
	 	}//end for
	 System.out.println(list.size());
	 list.forEach(e->sb.append(e+" "));
	 System.out.println(sb.toString().substring(0,sb.length()-1));
 	}
}
