package CompanyRoster2;

public class Employee implements Comparable<Employee> {
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
public Employee(String name, double salary, String position, String department, String email) {
	super();
	this.name = name;
	this.salary = salary;
	this.position = position;
	this.department = department;
	this.email = email;
	this.age=-1;
}
public Employee(String name, double salary, String position, String department, String email, int age) {
	super();
	this.name = name;
	this.salary = salary;
	this.position = position;
	this.department = department;
	this.email = email;
	this.age = age;
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
public String getEmail() {
	return email;
}
public int getAge() {
	return age;
}
@Override
public int compareTo(Employee o) {
	if(this.salary>o.salary) {
		return -1;
	}
	else if(this.salary<o.salary) {
		return 1;
	}
	else {
	return 0;
	}
}


}
