package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
private String name;
private Company company;
private List<Pokemons> pokemon=new ArrayList<>();
private List<Parents> parents=new ArrayList<>();;
private List<Children> children=new ArrayList<>();;
private Car car;


public Person(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public List<Pokemons> getPokemon() {
	return pokemon;
}
public void setPokemon(List<Pokemons> pokemon) {
	this.pokemon = pokemon;
}
public List<Parents> getParents() {
	return parents;
}
public void setParents(List<Parents> parents) {
	this.parents = parents;
}
public List<Children> getChildren() {
	return children;
}
public void setChildren(List<Children> children) {
	this.children = children;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

@Override
public String toString() {
	return String.format("%s\n%s\n%s\nPokemon:%s\nParents:%s\nChildren:%s\n", name,company==null?"Company:":company,
			car==null?"Car:":car,pokemon.isEmpty() ? "" :pokemon.toString().substring(1, pokemon.toString().length()-1).replaceAll(", ",""),	
parents.isEmpty() ? "" : parents.toString().substring(1, parents.toString().length()-1).replaceAll(", ", ""),
children.isEmpty() ? "" : children.toString().substring(1, children.toString().length()-1).replaceAll(", ", ""));

}

static class Company{
	private String company_name="";
	private String department="";
	private double salary;
	public Company(String company_name, String department, double data) {
		super();
		this.company_name = company_name;
		this.department = department;
		this.salary = data;
	}
	@Override
	public String toString() {
		return String.format("Company:\n%s %s %.2f",company_name,department,salary);
	}
	
	
}

 static class Pokemons{
	private String pokemon_name="";
	private String pokemon_type="";
	public Pokemons(String pokemon_name, String pokemon_type) {
		super();
		this.pokemon_name = pokemon_name;
		this.pokemon_type = pokemon_type;
	}
	@Override
	public String toString() {
		return String.format("\n%s %s",pokemon_name,pokemon_type);
	}
	
}
static class Parents{
	private String parent_name;
	private String parent_birthday;
	public Parents(String parent_name, String parent_birthday) {
		super();
		this.parent_name = parent_name;
		this.parent_birthday = parent_birthday;
	}
	@Override
	public String toString() {
		return String.format("\n%s %s", parent_name,parent_birthday);
	}
	
}
static class Children{
	private String child_name;
	private String child_birthday;
	public Children(String child_name, String child_birthday) {
		super();
		this.child_name = child_name;
		this.child_birthday = child_birthday;
	}
	@Override
	public String toString() {
		return String.format("\n%s %s", child_name,child_birthday);
	}
	
}
static class Car{
	private String car_model;
	private int speed;
	public Car(String car_model, int speed) {
		super();
		this.car_model = car_model;
		this.speed = speed;
	}
	@Override
	public String toString() {
		 	return String.format("Car:\n%s %s",car_model,speed);
	}
	
}
}
