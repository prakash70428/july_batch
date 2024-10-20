package lecture13;

public class Student {
     private String name;
     private int age;
     private int rollno;
     
     public Student(String name,int age,int rollno){
    	 this.name = name;
    	 this.age = age;
    	 this.rollno = rollno;
     }
     
     public void display() {
    	 System.out.println("name:" + name);
    	 System.out.println("age:" + age);
    	 System.out.println("rollno:" + rollno);
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age){
		try {
		 if(age < 0) {
			 throw new Exception("agelimitoutofcapacity");
		 }
		this.age = age;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}    
}
