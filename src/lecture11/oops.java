package lecture11;

public class oops {
	public static class Person{
		String name ;
		int age ;
		
		public void sayHi() {
			System.out.println(name+"@"+age+"sayHi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name="prafull";
		p1.age = 10;
		
		Person p2 = new Person();
		p2.name="shashwat";
		p2.age = 20;
		
		p1.sayHi();
		p2.sayHi();
		swap1(p1,p2);
		p1.sayHi();
		p2.sayHi();
	}
	public static void swap(Person p1,Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}
	public static void swap1(Person p1,Person p2) {
		p1 = new Person();
		String t = p1.name;
		p1.name = p2.name;
		p2.name = t;
		
		p2 = new Person();
	    int temp = p1.age;
	    p1.age = p2.age;
	    p2.age = temp;
	}

}
