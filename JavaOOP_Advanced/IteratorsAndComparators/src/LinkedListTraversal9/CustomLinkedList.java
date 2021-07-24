package LinkedListTraversal9;

import java.util.Iterator;

public class CustomLinkedList<T> implements MyList<T> {
private Node<T> head;
private int counter=0;

public void add(T element) {
	counter++;
	Node newNode = new Node(element);
	if(this.head == null){
		head = newNode;
	}else {
		Node currentNode = head;
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
	}
}

public T getIndex(int end) {
	Node<T> current=head;
	Node previous;
	for(int i=0;i<end;i++) {
		current=current.getNext();
		
	}
	return (T) current.getData();
	
}
public void remove(T number) {
	
	Node<T> current=head;
	Node<T> previous=current;
	for(int i=0;i<this.counter;i++) {
		if(current.getData()==number) {
			if(i==0) {
			head=current.getNext();
			counter--;
			break;
			}
			else if(current.getData()==number) {
				previous.setNext(current.getNext());
				counter--;
				break;
			}
			
		}
		 previous = current;
		current=current.getNext();
	}
	
}
public int size() {
	return counter;
}
@Override
public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return new Iterator<T>() {
		Node<T> current=head;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public T next() {
			T element=current.getData();
			current=current.getNext();
			return element;
		}
	};
}
}
