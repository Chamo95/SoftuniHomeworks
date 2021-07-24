package StackIterator3;

import java.util.Iterator;

public class LinkedStack<T> implements MyStack<T> {
	private Node<T> topnode;
	private int count;

	
	
	public LinkedStack() {
		
		this.topnode = null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			Node<T> tempNode = topnode;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return tempNode!=null;
			}

			@Override
			public T next() {
				T element= tempNode.getData();
				tempNode=tempNode.getNext();
				return element;
			}
		};
	}

	@Override
	public void push(T element) {
		topnode=new Node<T>(element, this.topnode);
		this.count++;
		
	}

	@Override
	public T pop() {
		if(this.isEmpty()) {
			throw new MyStackEmptyException();
		}
		T returnvalue=this.topnode.getData();
		this.topnode=this.topnode.getNext();
		this.count--;
		return returnvalue;
	}

	@Override
	public int size() {
		
		return this.count;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size()==0;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return topnode.getData();
	}

}
