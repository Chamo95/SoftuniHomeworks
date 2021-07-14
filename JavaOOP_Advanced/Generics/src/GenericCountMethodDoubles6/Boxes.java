package GenericCountMethodDoubles6;

public class Boxes<T extends Comparable<T>> {
	private T box;

	public Boxes(T box) {
		
		this.box = box;
	}

	@Override
	public String toString() {
		return String.format("%s",box);
	}
	

}
