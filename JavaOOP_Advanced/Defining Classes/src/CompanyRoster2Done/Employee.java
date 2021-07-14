package CompanyRoster2Done;

import java.util.stream.Collectors;
import java.util.*;
import java.util.Map.Entry;

public class Employee  {
private String name; // 
private double salary; //
private String position; //
private String department;//
private String email;
private int age;

public Employee(String name, double salary, String position, String department) {
	super();
	this.name = name;
	this.salary = salary;
	this.position = position;
	this.department = department;
	this.email="n/a";
	this.age=-1;
	
	
}


public String getName() {
	return name;
}
public double getSalary() {
	return salary;
}
public String getPosition() {
	return position;
}
public String getDepartment() {
	
	return department;
}

public void setEmail(String email) {
	this.email = email;
}


public void setAge(int age) {
	this.age = age;
}


public String getEmail() {
	return email;
}
public int getAge() {
	return age;
}

}