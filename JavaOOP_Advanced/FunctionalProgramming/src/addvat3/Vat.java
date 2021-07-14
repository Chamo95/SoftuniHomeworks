package addvat3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Vat {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		UnaryOperator<Double> un=x->x+x*0.2;
		System.out.println("Prices with VAT:");
	Arrays.asList(sc.nextLine().split(", ")).
	stream().
	mapToDouble(Double::parseDouble).
	forEach(x->{
		System.out.printf("%.2f\n",un.apply(x));
	});
		
		
	}

}
