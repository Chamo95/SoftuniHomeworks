package CatLady9;

public class Cat {
private String name;

public Cat(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Cat [name=" + name + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
class Siamese extends Cat{
	private double ear_size;

	public Siamese(String name,double ear_size) {
		super(name);
		this.ear_size = ear_size;
	}
	@Override
	public String toString() {
		return String.format("Siamese %s %.2f",super.getName(), ear_size);
	}
}
class Cymric extends Cat{
	private double furLength;

	public Cymric(String name,double furLength) {
		super(name);
		this.furLength =furLength;
	}

	@Override
	public String toString() {
		return String.format("Cymric %s %.2f",super.getName(), furLength);
	}
	
}
class StreetExtraordinaire extends Cat{
	private double decibelsOfMeows;

	public StreetExtraordinaire(String name,double decibelsOfMeows) {
		super(name);
		this.decibelsOfMeows = decibelsOfMeows;
	}

	@Override
	public String toString() {
		return String.format("StreetExtraordinaire %s %.2f",super.getName(), decibelsOfMeows);
	}
}