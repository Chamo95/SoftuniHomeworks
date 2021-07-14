package sumnumbers;

import java.util.function.Function;

public class sumnumber {
public static void main(String[] args) {
input();
}
public static  void input() {
	//Function<Integer, Double> half = a -> a / 2.0;
	Function<String, Integer> half = Integer::parseInt;
    // apply the function to get the result
    System.out.println(half.apply("10"));
}
}
