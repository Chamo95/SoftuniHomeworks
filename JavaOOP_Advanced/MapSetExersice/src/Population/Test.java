//package Population;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class Test {
//
//	public static void main(String[] args) {
//		input();
//	}
//
//	private static void input() {
//		Scanner sc=new Scanner(System.in);
//	TreeMap<String,Map<String,Integer>> map=new TreeMap<String,Map<String,Integer>>();
//	Map<String,Integer> country_popu=new LinkedHashMap<String, Integer>();
//	Map<String,Integer> reverseordered_country_popu=new LinkedHashMap<String, Integer>()
//		String data=sc.nextLine();
//		
//		while(!data.equals("report")) {
//			String[] arr=data.split("\\|");
//			if(map.containsKey(arr[1])) {
//				map.get(arr[1]).put(arr[0],Integer.parseInt(arr[2]) );
//				country_popu.put(arr[1], country_popu.get(arr[1])+Integer.parseInt(arr[2]));
//			}
//			else {
//map.put(arr[1], new HashMap<String, Integer>(){{put(arr[0], Integer.parseInt(arr[2]));}}  );
//country_popu.put(arr[1], Integer.parseInt(arr[2]));
//			}
//			data=sc.nextLine();
//		}//end of while
//		
//country_popu.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())
//).forEachOrdered(x-> reverseordered_country_popu.put(x.getKey(), x.getValue()));
//
//
//}
//}