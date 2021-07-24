package StackIterator3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Core {
	private CommandDispatcher dispatcher;
	Scanner sc;
	public Core(CommandDispatcher dispatcher) {
		this.dispatcher=dispatcher;
		sc=new Scanner(System.in);
	}

	
	public void run() {
		while(true) {
			String params[]=sc.nextLine().split("[ ,]+");
			
			String command=params[0];
			List<Integer> list=Arrays.stream(params).skip(1).map(Integer::parseInt).collect(Collectors.toList());
			dispatcher.dispatch(command, list);
			if(command.equals("END")) {
				break;
			}
		}
		
	}

}
