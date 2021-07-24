package StrategyPattern;



import java.util.Comparator;

public class CompareByAge implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
    	if(firstPerson.getPersonAge()<secondPerson.getPersonAge()) {
    		return -1;
    	}
    	else if(firstPerson.getPersonAge()>secondPerson.getPersonAge()) {
    		return 1;
    	}
        return 0;
    }
}