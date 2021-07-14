package Tuple;

public class Tuple<T1,T2> {
private T1 t1;
private T2 t2;

public Tuple(T1 t1, T2 t2) {
	super();
	this.t1 = t1;
	
	this.t2 = t2;
	
}




@Override
public String toString() {
	return String.format("%s -> %s", t1,t2);
}

}
