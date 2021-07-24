package Collection2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] create=sc.nextLine().split(" ");
		
		ListyIterator obj=new ListyIterator(create);
		String command=sc.nextLine();
		while(!command.equals("END")) {
			switch (command) {
			case "Move": {
				System.out.println(obj.Move());
				break;
			}
			case "HasNext": {
				System.out.println(obj.hasNext());
				break;
			}
			case "Print": {
				obj.Print();
				break;
			}
			case "PrintAll" :{
				obj.PrintAll();
				break;
			}
		}
			command=sc.nextLine();
	}

	}
}