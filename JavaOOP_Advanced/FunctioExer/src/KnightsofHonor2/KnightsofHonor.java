package KnightsofHonor2;

import java.util.Arrays;
import java.util.Scanner;

public class KnightsofHonor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arrays.asList(sc.nextLine().split(" ")).stream().forEach(x->System.out.println("Sir "+x));
	}

}
