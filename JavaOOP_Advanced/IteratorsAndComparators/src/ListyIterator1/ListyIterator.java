package ListyIterator1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListyIterator {
	List<String> list;
	private int counter=1;
	public ListyIterator(String... list) {
		this.setList(list);
		
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(String... names) {
		if(names.length==1) {
			list=new ArrayList<String>();
			
		}
		else {
			list=new ArrayList<String>(Arrays.asList(names));
			
		}
	}

	public boolean Move() {
		if(counter<list.size()-1) {
			counter++;
			return true;
		}
		return false;
		
	}
	public boolean hasNext() {
		if(counter<list.size()-1) {
			
			
			return true;
		}
		return false;
		
	}
	public void Print() {
		if(!list.isEmpty()) {
			System.out.println(list.get(counter));
		}
		else {
			System.out.println("Invalid Operation!");
		}
		
	}

	@Override
	public String toString() {
		return "ListyIterator [list=" + list + "]";
	}
	
}
