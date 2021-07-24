package LinkedListTraversal9;

public interface MyList<T> extends Iterable<T> {

	 T getIndex(int end);
	void add(T element);
	void remove(T number);
	
}
