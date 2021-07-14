package CustomListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements ListInterface<T>,Iterable<T> {

	private List<T> list=new ArrayList<T>();


@Override
public void add(T e) {
	
	list.add(e);
	
}

@Override
public T remove(int index) {
	
	return list.remove(index);
}

@Override
public boolean contains(T element) {
	return list.contains(element);
}

@Override
public void swap(int first, int second) {
	T hold=list.get(first);
	list.set(first, list.get(second));
	list.set(second, hold);
}

@Override
public int countGreaterThan(T element) {
	int count=0;
	for(T x:list) {
		if(element.compareTo(x)<0) {
			count++;
		}
	}
	return count;
}

@Override
public T getMax() {
	T max=list.get(0);
	for(T x:list) {
		if(x.compareTo(max)>0) {
			max=x;
		}
		
	}
	return max;
}

@Override
public T getMin() {
	T min=list.get(0);
	for(T x:list) {
		if(x.compareTo(min)<0) {
			min=x;
		}
	}
	return min;
	
}
public void Print() {
	
	for(T x:list) {
		System.out.println(String.valueOf(x));
	}
}
public int getSize() {
		
		return list.size();
}
public T getelement(int i) {
	
	return list.get(i);
}

@Override
public Iterator<T> iterator() {
	
	return list.iterator();
}
}
