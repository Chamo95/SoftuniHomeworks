package Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;




public class Robot {
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private static String[] robotname;
	private static int[] processTime;
	private static long start_time=0;
	private static Deque<String> products=new ArrayDeque<String>();
	
	private static int[] processing;
	public static void main(String[] args) throws IOException {
		Readinput();
		
		while(!products.isEmpty()) {
			start_time+=1;
			String product=products.removeFirst();
			process();
			boolean allBusy=true;
			for(int i=0;i<processing.length;i++) {
				if(isIdle(i)) {
					 allBusy=false;
					processing[i]=processTime[i];
	System.out.println(String.format("%s - %s [%s]", robotname[i], product, calculateTime(start_time)));
			break;
				}
			}
			if(allBusy) {
				products.addLast(product);
			}
			
		}
	}
	private static String calculateTime(long start_time) {
		long h= start_time%86400/3600;
		long min= start_time%3600/60;
		long ss= start_time%60;
		DecimalFormat df=new DecimalFormat("00");
		return String.format("%s:%s:%s",df.format(h),df.format(min),df.format(ss));
	}
	public static boolean isIdle(int i) {
		return processing[i]==0;
	}
	public static void process() {
		for(int i=0;i<processing.length;i++) {
			processing[i]= processing[i]==0 ? 0:processing[i]-1;
		}
	}
	public static void Readinput() throws IOException {
		getRobot();
		getStartingTime();
		getProducts();
		}
	
	public static void getRobot() throws IOException {
		String robot[]= br.readLine().split(";");
		robotname=new String[robot.length];
		processTime=new int[robot.length];
		
		processing=new int[robot.length];
		for(int i=0;i<robot.length;i++) {
			robotname[i]=robot[i].split("-")[0];
			processTime[i]=Integer.parseInt(robot[i].split("-")[1]);
			
		}
	   
	}
	public static void getStartingTime() throws IOException{
		String[] time= br.readLine().split(":");
		int ss=0;
		ss+=3600*Integer.parseInt(time[0]);
		ss+=60*Integer.parseInt(time[1]);
		ss+=Integer.parseInt(time[2]);
		start_time=ss;
	}
	public static void getProducts() throws IOException {
		String input;
		while(!"End".equals(input=br.readLine())) {
			products.add(input);
		}
		
	}
}
