package CarSalesman5;

public class Car {
	private String model;
	private Engine engine; 
	private String weight="n/a";;
	private String color="n/a";;
	public Car(String model, Engine engine) {
		super();
		this.model = model;
		this.engine = engine;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%s:\n%s\nWeight: %s\nColor: %s\n", model,engine,weight,color);
	}
	
}
