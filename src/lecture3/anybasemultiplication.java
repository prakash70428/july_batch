package lecture3;
import java.util.*;
public class anybasemultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n1 = scn.nextInt();
	     int n2 = scn.nextInt();
	     int b = scn.nextInt();
	        
	     int ans = getProduct(n1,n2,b);
	     System.out.println(ans);
	}
	
	public static int getProduct(int n1,int n2,int b) {
		int ans = 0;
		int power = 1;
		
		while(n2 != 0) {
			int ldn2 = n2 % 10;
			n2 /= 10;
			
			int pwsd = gpwsd(n1,ldn2,b);
			//ans = ans + (pwsd * power); [this is wrong]
			ans = aba(ans,pwsd * power,b);
			power *= 10;
		}
		
		return ans;
	}
	
	//assumption n2 is a single digit
	public static int gpwsd(int n1,int n2,int b) {
		int ans = 0;
		int carry = 0;
		int power = 1;
		
		while(n1 != 0 || carry != 0) {
			int ldn1 = n1 % 10;
			n1 /= 10;
			
			int product = (ldn1*n2) + carry;
			int q = product / b;
			int r = product % b;
			
			ans += (r * power);
			carry = q;
			power *= 10;
		}
		
		return ans;
	}
	
	public static int aba(int n1,int n2,int b) {
		int ans = 0;
		int power = 1;
		int carry = 0;
		
		while(n1 != 0 || n2 != 0 || carry != 0) {
			int ldn1 = n1 % 10;
			int ldn2 = n2 % 10;
			n1 /= 10;
			n2 /= 10;
			
			int sum = ldn1 + ldn2 + carry;
			int q = sum / b;
			int r = sum % b;
			
			ans += (r * power);
			carry = q;
			power *= 10;
		}
		
		return ans;
	}

}
