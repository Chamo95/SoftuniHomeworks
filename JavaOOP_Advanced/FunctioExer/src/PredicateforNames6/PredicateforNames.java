package PredicateforNames6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateforNames {
static int length;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 length=Integer.parseInt(sc.nextLine());
		Arrays.asList(sc.nextLine().split(" ")).stream().filter(check).forEach(System.out::println);
	}
private static Predicate<String> check=input->{
	if(input.length()<=length) {
		return true;
	}
	else {
		return false;
	}
	
};
}
