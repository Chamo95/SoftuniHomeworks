package CarSalesman5;

public class Engine {
 private String model;
 private String power;
 private String displacement="n/a";
 private String efficiency="n/a";;
public Engine(String model, String power) {
	super();
	this.model = model;
	this.power = power;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getPower() {
	return power;
}
public void setPower(String power) {
	this.power = power;
}
public String getDisplacement() {
	return displacement;
}
public void setDisplacement(String displacement) {
	this.displacement = displacement;
}
public String getEfficiency() {
	return efficiency;
}
public void setEfficiency(String efficiency) {
	this.efficiency = efficiency;
}
@Override
public String toString() {
	return String.format("%s:\nPower: %s\nDisplacement: %s\nEfficiency: %s", model,power,displacement,efficiency);
}
 
}
