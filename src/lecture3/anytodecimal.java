package lecture3;
import java.util.*;
public class anytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        int sol = anybasetodecimal(n,b);
        System.out.println(sol);
	}
	
	public static int anybasetodecimal(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			ans += (ld * power);
			power *= b;
		}
		
		return ans;
	}

}
