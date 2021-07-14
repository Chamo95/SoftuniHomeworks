package GenericCountMethodStrings5;

import java.util.ArrayList;
import java.util.List;

public  class Box<T extends Comparable<T>> {

	
	private T box;

	public Box(T box) {
		
		this.box = box;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(box.getClass().getName()).append(String.format(": %s",box));
        return sb.toString();
    }
		
	
	
	
	

	

}
