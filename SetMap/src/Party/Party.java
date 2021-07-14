package Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Party {

	public static void main(String[] args) throws IOException {
		input();

	}

	private static void input() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		SortedSet<String> VIPlist=new TreeSet<String>();
		SortedSet<String> regular=new TreeSet<String>();
		String line=br.readLine();
		while(!line.equals("PARTY")) {
			if(Character.isDigit(line.charAt(0))) {
				VIPlist.add(line);
			}
			else {
				regular.add(line);
			}
			line=br.readLine();
		}
	
	line=br.readLine();
	while(!line.equals("END")) {
		if(VIPlist.contains(line)) {
			VIPlist.remove(line);
		}
	else if(regular.contains(line)) {
		regular.remove(line);
	}
	line=br.readLine();
		} //end of while end
	System.out.println(VIPlist.size()+regular.size());
	Iterator<String> it=VIPlist.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	it=regular.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
}