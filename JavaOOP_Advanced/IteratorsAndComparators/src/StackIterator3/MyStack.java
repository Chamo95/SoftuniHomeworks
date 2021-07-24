package StackIterator3;

public interface MyStack<T> extends Iterable<T> {
void push(T element);
T pop();
int size();
boolean isEmpty();
T peek();
}
