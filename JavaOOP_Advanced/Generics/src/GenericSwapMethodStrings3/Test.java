package GenericSwapMethodStrings3;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Integer x[]= {1,2,3,4};
		Character y[]= {'a','b'};
		say(y);

	}
 public static <T> void say(T[] arr) {
	for(T obj:arr) {
		System.out.println(obj);
	}
 }
}
