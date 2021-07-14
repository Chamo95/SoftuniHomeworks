package recur;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	static Map<Integer,Long> map=new HashMap<Integer,Long>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(getFibonacci(n));

	}

	private static long  getFibonacci(int n) {
		if(n<2) {
			return 1;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		}
		else {
			long result=getFibonacci(n-1)+getFibonacci(n-2);
			map.put(n, result);
		}
		return getFibonacci(n-1)+getFibonacci(n-2);
	}

}
