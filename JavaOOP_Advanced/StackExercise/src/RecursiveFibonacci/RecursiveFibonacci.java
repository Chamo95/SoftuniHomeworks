package RecursiveFibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



public class RecursiveFibonacci {
static	Map<Integer,Long> map=new HashMap<Integer,Long>();
static long result;
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(getFibonacci(Integer.parseInt(br.readLine())));
	}
 public static long getFibonacci(int n) {
	 if(n<2) {
		 return 1;
	 }
	 if(map.containsKey(n)) {
		return result=map.get(n);
	 }
	 long result=getFibonacci(n-1)+getFibonacci(n-2);
	  map.put(n, result);
	 return result;
 }
}
