package Froggy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=Arrays.stream(sc.nextLine().split("[, ]+")).map(Integer::parseInt)
		.collect(Collectors.toList());
		sc.nextLine();
		Lake<Integer> lake=new Lake<>(list);
		StringBuilder sb=new StringBuilder();
		lake.forEach(e->sb.append(e).append(", "));
		sb.setLength(sb.length()-2);
		System.out.println(sb.toString());
	}

}
