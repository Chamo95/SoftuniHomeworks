package SpeedRacing3;

import java.util.Locale;

public class Car {
private String model;
private double fuelamount;
private double FuelCostFor1km;
private double distance;


public Car(String model, double fuelamount, double fuelCostFor1km) {
	super();
	this.model = model;
	this.fuelamount = fuelamount;
	FuelCostFor1km = fuelCostFor1km;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getFuelamount() {
	return fuelamount;
}
public void setFuelamount(double fuelamount) {
	this.fuelamount = fuelamount;
}
public double getFuelCostFor1km() {
	return FuelCostFor1km;
}
public void setFuelCostFor1km(double fuelCostFor1km) {
	FuelCostFor1km = fuelCostFor1km;
}
public double getDistance() {
	return distance;
}
public void setDistance(double distance) {
	this.distance = distance;
}
public void calculate(int km) {
	double reduced=km*FuelCostFor1km;
	if(reduced<=fuelamount) {
		fuelamount-=reduced;
		distance+=km;
	}
	else {
		System.out.println("Insufficient fuel for the drive");
	}
}
@Override
public String toString() {
	return String.format(Locale.US,"%s %.2f %.0f", model,fuelamount,distance);
}

}
