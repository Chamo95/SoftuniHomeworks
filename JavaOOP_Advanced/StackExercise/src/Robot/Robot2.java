package Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;




public class Robot2 {
 private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 private static String robotname[];
 private static int processTime[];
 private static int process[];
 private static int start_time;
 private static Deque<String> products=new ArrayDeque<String>();
	public static void main(String[] args) throws IOException {
	Readinput();
	
	while(!products.isEmpty()) {
		String product= products.removeFirst();
		start_time++;
		process();
		
		boolean isBusy=true;
		for(int i=0;i<process.length;i++) {
			if(isIdle(i)) {
				isBusy=false;
				process[i]=processTime[i];
				System.out.printf("%s - %s [%s]\n",robotname[i],product,calculatetime(start_time));
				break;
			}
		}
		if(isBusy) {
			products.addLast(product);
		}
	}
}
	
	
	public static String calculatetime(int start_time) {
		int h= start_time%86400/3600;
		int min= start_time%3600/60;
		int ss= start_time%60;
		DecimalFormat df=new DecimalFormat("00");
	return String.format("%s:%s:%s",df.format(h),df.format(min),df.format(ss));	
	}
	
	
	public static void process() {
		for(int i=0;i<process.length;i++) {
			process[i] = process[i]==0 ? 0 : process[i]-1;
		}

	}
	public static boolean isIdle(int i) {
		return process[i]==0;
		}
	public static void Readinput() throws IOException {
		getRobot();
		getTime();
		getProcess();
	}
	public static void getRobot() throws IOException {
		String[] robot= br.readLine().split(";");
		robotname=new String[robot.length];
		processTime=new int[robot.length];
		process=new int[robot.length];
		for(int i=0;i<robot.length;i++) {
			robotname[i]=robot[i].split("-")[0];
			processTime[i]=Integer.parseInt( robot[i].split("-")[1]);
		}
	}
	public static void getTime() throws IOException {
		String time= br.readLine();
		int ss=0;
		ss+= 3600*Integer.parseInt(time.split(":")[0]);
		ss+= 60*Integer.parseInt(time.split(":")[1]);
		ss+= Integer.parseInt(time.split(":")[2]);
		start_time=ss;
	}
	public static void getProcess() throws IOException {
	    String product;
	    while(!"End".equals(product=br.readLine())){
	    	products.add(product);
	    }
	}
}
