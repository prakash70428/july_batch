package lecture16;
 class Studentt{
	String name;
	int age;
	static int count;
	
	public Studentt(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println(name+"@"+age+" says hi");
	}
	public static void display1() {
		System.out.println("in static method");
	}
	
}

public class demo {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Studentt s = new Studentt("A",10);
		Studentt s1 = new Studentt("B",20);
		Studentt s2 = new Studentt("C",30);
		s.display();
		s1.display();
		s2.display();
		
		System.out.println(Studentt.count);
		Studentt.display1();
	}
}
