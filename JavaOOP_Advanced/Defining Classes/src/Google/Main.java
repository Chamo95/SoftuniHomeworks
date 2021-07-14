package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Google.Person.Car;
import Google.Person.Children;
import Google.Person.Company;
import Google.Person.Parents;
import Google.Person.Pokemons;

import java.util.List;
public class Main {
	static Map<String,Person> people=new HashMap<>();
	public static void main(String[] args) {
		StringToObeject();
		
	}
	public static void StringToObeject() {
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		while(!command.equals("End")) {
			String[] data=command.split(" ");
			Person person;
			if(!people.containsKey(data[0])) {
				 person=new Person(data[0]);
				people.put(data[0], person);
				}
			else {
				person=people.get(data[0]);
			}
	
	switch(data[1])
	{
	case "pokemon":	List<Pokemons> list=person.getPokemon(); list.add(new Pokemons(data[2],data[3]));
	person.setPokemon(list); break;
	case "company": person.setCompany(new Company(data[2], data[3], Double.parseDouble(data[4])));break;
	case "parents":List<Parents> list2=person.getParents(); list2.add(new Parents(data[2], data[3])); break;
	case "children":List<Children> list3=person.getChildren(); list3.add(new Children(data[2], data[3])); break;
	case "car" : person.setCar(new Car(data[2], Integer.parseInt(data[3]))); break;
	}
	
	
	//System.out.println(people.get(data[0]));
			command=sc.nextLine();
		}//end of while
		command=sc.nextLine();
		if(people.containsKey(command)) {
			System.out.println(people.get(command));
		}
	}
}
