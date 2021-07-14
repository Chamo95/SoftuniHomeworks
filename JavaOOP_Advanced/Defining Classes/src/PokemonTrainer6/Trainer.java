package PokemonTrainer6;

import java.util.List;

public class Trainer implements Comparable<Trainer> {
private String name;
private int numberofbadges=0;
private List<Pokemon> list;
public Trainer(String name, List<Pokemon> list) {
	super();
	this.name = name;
	this.list = list;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumberofbadges() {
	return numberofbadges;
}
public void setNumberofbadges(int numberofbadges) {
	this.numberofbadges += numberofbadges;
}
public List<Pokemon> getList() {
	return list;
}
public void setList(List<Pokemon> list) {
	this.list = list;
}
@Override
public String toString() {
	return 	String.format("%s %d %d",name,numberofbadges,list.size());
}
@Override
public int compareTo(Trainer o) {
	if(this.numberofbadges<o.numberofbadges) {
		return 1;
	}
	else if(this.numberofbadges>o.numberofbadges) {
		return -1;
	}
	else {
	return 0;
	}
}

}
