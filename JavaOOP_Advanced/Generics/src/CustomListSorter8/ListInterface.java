package CustomListSorter8;

public interface ListInterface<T> {
	T remove(int index);
	 void add(T e);
	 boolean contains(T element);
	 void swap(int first, int second);
	 int countGreaterThan(T element);
	 T getMax();
	 T getMin();
	 
}
