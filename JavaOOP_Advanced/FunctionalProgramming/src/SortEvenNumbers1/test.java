package SortEvenNumbers1;

import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		Stream.of(1,2,3).filter( x-> x>1 )
        .filter( x-> x>2 )
        .forEach(System.out::print);

	}

}
