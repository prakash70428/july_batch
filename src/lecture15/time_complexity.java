package lecture15;
import java.util.*;

public class time_complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. experimental way
//		long start = System.currentTimeMillis();
//		for(int i=0;i < 100000;i++) {
//			
//		}
//		long end = System.currentTimeMillis();
//		
//		long duration = end - start;
//		System.out.println(duration);
		 
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		int nm1f = factorial(n - 1);
		int nf = nm1f*n;
		return nf;
	}
	//power variation
	public static int power(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnm1 = power(x,n-1);
		int xpn = xpnm1 * x;
		return xpn;
	}
	public static int power1(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpn = power1(x,n/2)*power1(x,n/2);
		if(n%2 != 0) {
			xpn *= x;
		}
		return xpn;
	}
	public static int power2(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnby2 = power2(x,n/2);
		int xpn = xpnby2 * xpnby2;
		if(n%2 != 0) {
			xpn *= x;
		}
		return xpn;
	}
	public static void printstairpaths(int n,String asf) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			System.out.println(asf);
			return;
		}
		
		printstairpaths(n - 1,asf+"1");
		printstairpaths(n - 2,asf+"2");
		printstairpaths(n - 3,asf+"3");
	}
	public static void printmazepaths(int sr,int sc,int dr,int dc,String asf) {
		//constant work
		
		printmazepaths(sr,sc+1,dr,dc,asf+"h");
		printmazepaths(sr+1,sc,dr,dc,asf+"v");
	}
	
	

}
