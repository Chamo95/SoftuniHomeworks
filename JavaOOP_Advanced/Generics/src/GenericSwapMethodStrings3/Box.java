package GenericSwapMethodStrings3;

import java.util.ArrayList;
import java.util.List;

public  class Box<T> {
	private List<T> list;

	public Box() {
		this.list=new ArrayList<>();
	}
	public void add(T value) {
		
		this.list.add(value);
		
	}
	public <String> void swap(int first,int second) {
		
		String hold=(String) list.get(first);	
		list.set(first, list.get(second));
		list.set(second,(T) hold);
		for(T x:list) {
			System.out.printf("%s: %s\n",x.getClass().getName(),x);
		}
	}
	
	

	

}
