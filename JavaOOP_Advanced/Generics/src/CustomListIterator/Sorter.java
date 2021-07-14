package CustomListIterator;

import java.util.List;

public class Sorter<T extends Comparable<T>>  {
	
 public  void sort(CustomList<T> list) {
	 
	 for (int i = 0; i < list.getSize(); i++) {
        
         for (int j = i + 1; j < list.getSize(); j++) {
             
             if (list.getelement(i).compareTo(list.getelement(j)) > 0) {
            	 list.swap(i, j);
             }
         }
	 
 }
 }
 }
