package StrategyPattern;

import java.util.Comparator;

public class CompareByName implements Comparator<Person> {

	@Override
	public int compare(Person firstPerson, Person secondPerson) {
    int namelength=Integer.compare(firstPerson.getPersonName().length(), secondPerson.getPersonName().length());
    int character = Character.compare(firstPerson.getPersonName().toLowerCase().charAt(0), secondPerson.getPersonName().toLowerCase().charAt(0));
    if(namelength==0) {
    	return character;
    }
	return namelength;
}

}