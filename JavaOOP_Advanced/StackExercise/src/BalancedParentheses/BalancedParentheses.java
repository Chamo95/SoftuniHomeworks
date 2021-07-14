//package BalancedParentheses;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class BalancedParentheses {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Deque<Character> de=new ArrayDeque<Character>();
//		String input=sc.nextLine();
//		Character c;
//		for(Character a: input.toCharArray()) {
//			de.add(a);
//		}
//	de.po
//		while(!de.isEmpty()) {
//			if((int)(c=de.removeFirst())==123&&(int)de.peekFirst()==125){
//				de.removeFirst();
//				if(de.isEmpty()) {
//					
//					break;
//				}
//			}
//			else {  de.addFirst(c); }
//			
//			if((int)(c=de.removeFirst())==91&&(int)de.peekFirst()==93){
//				de.removeFirst();
//				if(de.isEmpty()) {
//					
//					break;
//				}
//			}
//			else { de.addFirst(c); }
//			if((int)(c=de.removeFirst())==40&&(int)de.peekFirst()==41){
//				de.removeFirst();
//				if(de.isEmpty()) {
//					
//					break;
//				}
//			}
//			else { de.addFirst(c); break; }
//		}
//		
//		
//		while(!de.isEmpty()) {
//			
//	if((int)de.peekFirst()==123&&(int)de.peekLast()==125||(int)de.peekFirst()==91&&(int)de.peekLast()==93
//	||(int)de.peekFirst()==40&&(int)de.peekLast()==41) {
//				de.removeFirst();
//				de.removeLast();
//				
//			}
//	
//			else {
//				System.out.println("NO");
//				return;
//			}
//	
//		}
//		System.out.println("YES");
//		
//	}
//
//}
