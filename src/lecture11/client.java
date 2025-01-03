package lecture11;
import java.util.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. case
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		//2. case
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d);
//		System.out.println(((C)(obj)).d2);
//		
//		obj.fun(); //method overriding
//		obj.fun1();
//		((C)(obj)).fun2();
		
		//3. case
//		C obj = new P();
		
		 // 4. case
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(((P)(obj)).d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		
		obj.fun();
		obj.fun2();
		obj.fun1();
		
	}

}
