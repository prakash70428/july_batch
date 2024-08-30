package lecture7;
import java.util.*;
public class tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t1 = scn.nextInt();
		int t2 = scn.nextInt();
		int t3 = scn.nextInt();
		
		toh(n,t1,t2,t3);
	}
	
	public static void toh(int n,int t1,int t2,int t3) {
		if(n == 0) {
			return;
		}
		
		toh(n-1 ,t1,t3,t2);
		System.out.println(n + "[" + t1 + "->" + t2 + "]");
		toh(n-1,t3,t2,t1);
	}

}
