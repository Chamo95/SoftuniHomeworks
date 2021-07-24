package Froggy;

import java.util.Iterator;
import java.util.List;

import Froggy.Lake.Frog;

public class Lake<Integer> implements Iterable<Integer>  {
	private List<Integer> list;
	
	public Lake(List<Integer> list) {
		super();
		this.list = list;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Frog();
	}
	 class Frog implements Iterator<Integer>{
		 private int index;
		 private int count;
		 private boolean FoundAllEven;
		 private Integer integer;
		 
		 public Frog() {
			this.index=-2;
			this.FoundAllEven=false;
			this.count=0;
		}
		private void Number() {
			 if(!FoundAllEven) {
				 if(this.index+2<list.size()) {
					
					 this.count++;
					this.integer=list.get(index+=2);
					return;
				 }
				 this.index=-1;
				 this.FoundAllEven=true;
			 }
			this.integer =list.get(index+=2);
			this.count++;
		 }
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return this.count<list.size();
		}

		@Override
		public Integer next() {
			if(hasNext()) {
				Number();
			return this.integer;	
			}
			return null;
		}
		 
	 }
}
