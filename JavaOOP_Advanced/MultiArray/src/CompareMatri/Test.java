package CompareMatri;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Set<Integer[]> set=new LinkedHashSet<Integer[]>();
	Integer x[]= {1,2};
	Integer y[]= {1,2};
	set.add(x); set.add(y);
	for(Integer[] a:set) {
		for(Integer b:a) {
			System.out.println(b);
		}
		
	}

}
}
