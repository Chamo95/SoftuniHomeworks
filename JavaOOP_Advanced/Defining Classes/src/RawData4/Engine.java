package RawData4;

public class Engine {
private int EngineSpeed;
private int EnginePower;


public Engine(int engineSpeed, int enginePower) {
	super();
	EngineSpeed = engineSpeed;
	EnginePower = enginePower;
}
public int getEngineSpeed() {
	return EngineSpeed;
}
public void setEngineSpeed(int engineSpeed) {
	EngineSpeed = engineSpeed;
}
public int getEnginePower() {
	return EnginePower;
}
public void setEnginePower(int enginePower) {
	EnginePower = enginePower;
}

}
