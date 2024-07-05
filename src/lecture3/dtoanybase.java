package lecture3;
import java.util.*;
public class dtoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        int sol = decimaltoanybase(n,b);
        System.out.println(sol);
	}
	
	public static int decimaltoanybase(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int r = n % b;
			n = n / b;
			
			ans += (r * power);
			power *= 10;
		}
		
		return ans;
	}
	
}
