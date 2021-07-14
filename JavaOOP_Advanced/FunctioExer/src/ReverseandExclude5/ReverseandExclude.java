package ReverseandExclude5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseandExclude {
	static int divide;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.asList(sc.nextLine().split(" ")).stream()
	.map(Integer::parseInt).collect(Collectors.toList());
	
		Collections.reverse(list);
		divide=Integer.parseInt(sc.nextLine());
		list=list.stream().filter(x->x%divide !=0).collect(Collectors.toList());
		//System.out.println(list.toString().substring(1,list.toString().length()-1).replace(",", ""));
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1)
			System.out.print(list.get(i));
			else
				System.out.print(list.get(i)+" ");
		}
	}

}
