package filterbyage;

public class Persona implements Comparable<Persona>{
private String name;
private int age;
public static String way;
public static String format;


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void display() {
	switch(format) {
	case "name" :  System.out.println(this.getName()); break; 
	case "age":  System.out.println(this.getAge()); break;
	case "name age" : System.out.println(this.getName()+"-"+this.getAge());
	
	}
}
public Persona() {
	
}
public Persona(String name) {
	super();
	this.name = name;
}

public Persona(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

public String getName() {
	return name;
}

@Override
public int compareTo(Persona o) {
	if(way.equals("older")) {
	if(this.age>o.age) {
		return 1;
	}
	else {
		return -1;
	}
	}
	else {
		if(this.age<o.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

}


