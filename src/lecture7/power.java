package lecture7;
import java.util.*;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		
		int ans = power(x,n);
		System.out.println(ans);
	}
	
	public static int power(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnm1 = power(x , n - 1);
		int xpn = x * xpnm1;
		return xpn;
	}

}
