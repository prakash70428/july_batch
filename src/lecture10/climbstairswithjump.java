package lecture10;
import java.util.*;
public class climbstairswithjump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
//        int[] dp = new int[n + 1]; //1. create storage
//        System.out.println(cs2Memo(arr,0,dp));
        System.out.println(cs2Tab(arr));
	}
	public static int cs2Memo(int[] arr,int idx,int[] dp) {
		if(idx == arr.length) {
			return 1;
		}
		if(idx > arr.length) {
			return 0;
		}
		if(dp[idx] != 0) {
			return dp[idx];
		}
		
		int ans = 0;
		for(int jump=1;jump <= arr[idx];jump++) {
			ans += cs2(arr , idx + jump,dp);
		}
		
		dp[idx] = ans;
		return ans;
	}
	public static int cs2Tab(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[n] = 1; // destn -> destn
		
		for(int i=n-1;i >= 0;i--) {
			for(int jump=1;jump <= arr[i];jump++) {
				if(i + jump <= n) {
					dp[i] += dp[i + jump];
				}	
			}
		}
		
		return dp[0];
	}

}
