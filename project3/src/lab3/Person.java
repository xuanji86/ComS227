package lab3;

public class Person {
	
	private String name;
	private int age;
	  
	  public Person(String givenName, int givenAge){
		//  name = givenName;
		//  age = givenAge;
	  }
	  
	  public String getName()
	  {
	    return name;
	  }
	  
	  public int getAge()
	  {
	    return age;
	  }
	  
	  public int getNameLength()
	  {
	    return name.length();	//Fix return name.length()-1;
	  }
	
}