package lecture10;

import java.util.*;

public class goldmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i < n;i++) {
        	for(int j=0;j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        System.out.println(goldminTab(arr));
	}
	
	public static int goldminTab(int[][] arr) {
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int j=arr[0].length-1;j >= 0;j--) {
			for(int i=0 ;i < arr.length;i++) {
				if(j == arr[0].length - 1) {
					dp[i][j] = arr[i][j];
				}
				if(i == 0) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
				}
				else if(i == arr.length - 1) {
					dp[i][j] = arr[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
				}
				else {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],Math.max(dp[i-1][j+1], dp[i+1][j+1]));
				}
			}
		}
		
		int ans = 0;
		for(int i=0 ;i < dp.length;i++) {
			ans = Math.max(ans, dp[i][0]);
		}
		
		return ans;
	}

}
