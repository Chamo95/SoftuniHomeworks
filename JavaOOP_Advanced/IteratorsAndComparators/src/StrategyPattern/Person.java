package StrategyPattern;

public class Person  {
	private String personName;
    private Integer personAge;
    
    
	public Person(String personName, Integer personAge) {
		
		this.personName = personName;
		this.personAge = personAge;
	}

	

	public String getPersonName() {
		return personName;
	}
	
	public Integer getPersonAge() {
		return personAge;
	}



	@Override
	public String toString() {
		return String.format("%s %d", this.personName,this.personAge);
	}
    

}
