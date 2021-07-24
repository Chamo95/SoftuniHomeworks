package Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListyIterator implements Iterable<String> {
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
	public void PrintAll() {
		Iterator<String> it=iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
	}
	
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
          int  currentIndex = 1;

            @Override
            public boolean hasNext() {
               if(currentIndex<list.size()) {
            	   return true;
               }
               else {
            	   return false;
               }
            }

            @Override
            public String next() {
            	
                return list.get(currentIndex++);
            }
	};
	
	}
}
