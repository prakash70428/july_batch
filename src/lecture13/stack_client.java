package lecture13;
import java.util.*;
public class stack_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		CustomStack st = new CustomStack(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.isfull());
		st.push(50);
		
		st.push(60);
		
		st.display();
		st.pop();
		st.pop();
		st.display();
		
		System.out.println(st.size());
		System.out.println(st.top());
	}

}
