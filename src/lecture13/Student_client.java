package lecture13;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Shashwat",20,101);
        s1.setAge(-35);
        s1.display();
        
        System.out.println("---------------");
        
        Student s2 = new Student("Vikash",21,102);
        s1.setAge(21);
        s2.display();
	}

}
