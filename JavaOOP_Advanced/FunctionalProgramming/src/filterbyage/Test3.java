package filterbyage;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Test3 {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

        IntFunction<String> consoleLineReader = ignored -> scanner.nextLine();
        
        System.out.println(consoleLineReader.apply(10));

	}

}
