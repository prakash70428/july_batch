package lecture10;
import java.util.*;
public class climpstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int[] dp = new int[n + 1];
        //System.out.println(csMem(n,dp));
        System.out.println(csTab(n));
	}
	
	public static int csMem(int n,int[] dp) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 0;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int f1 = csMem(n - 1,dp);
		int f2 = csMem(n - 2,dp);
		int f3 = csMem(n - 3,dp);
		
		int ans = f1 + f2 + f3;
		dp[n] = ans;
		return ans;
	}
	
	public static int csTab(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1; //0 -> 0 no. of ways 1
		
		for(int i=1;i <= n;i++) {
			dp[i] = dp[i-1];
			if(i-2 >= 0) {
				dp[i] += dp[i-2];
			}
			if(i-3 >= 0) {
				dp[i] += dp[i-3];
			}
		}
		
		return dp[n];
	}

}
