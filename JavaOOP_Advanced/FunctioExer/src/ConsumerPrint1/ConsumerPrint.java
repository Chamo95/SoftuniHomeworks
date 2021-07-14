package ConsumerPrint1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Consumer<String> consume=System.out::println; 
		Arrays.asList(sc.nextLine().split(" ")).stream().forEach(consume);

	}

}
