package ComparingObjects;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private String town;
	
	public Person(String name, int age, String town) {
		super();
		this.name = name;
		this.age = age;
		this.town = town;
	}

	@Override
	public int compareTo(Person o) {
	
return this.name.equals(o.name) && this.age==o.age && this.town.equals(o.town) ? 0 : 1  ;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", town=" + town + "]";
	}
	
}
