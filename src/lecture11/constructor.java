package lecture11;

public class constructor {
	public static class Person{
		String name;
	    int age;
	    
	    public void sayHi() {
	    	System.out.println(name + "@" + age +" sayHi");
	    }
	    
	    //default constructor
	    public Person() {
	    	
	    }
	    //parametrized constructor
	    public Person(String name,int age) {
	    	this.name = name;
	    	this.age = age;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1 = new Person("B",20);
        p1.sayHi();
	}

}
