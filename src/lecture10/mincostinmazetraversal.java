package lecture10;
import java.util.*;
public class mincostinmazetraversal {

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
        
//        System.out.println(minCost(arr,0,0));
        System.out.println(minCostTab(arr));
	}
	public static int minCost(int[][] arr,int sr,int sc) {
		if(sr == arr.length-1 && sc == arr[0].length-1) {
			return arr[sr][sc];
		}
		if(sr >= arr.length || sc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		
		int f1 =  minCost(arr,sr,sc+1);
		int f2 =  minCost(arr,sr+1,sc);
		
		int ans = Math.min(f1, f2) + arr[sr][sc];
		
		return ans;
	}
	public static int minCostTab(int[][] arr) {
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int i=dp.length-1;i >= 0;i--) {
			for(int j=dp[0].length-1;j >= 0;j--) {
				if(i == dp.length-1 && j == dp[0].length-1) {
					dp[i][j] = arr[i][j];
				}
				else if(i == dp.length - 1) {
					dp[i][j] = arr[i][j] + dp[i][j+1];
				}
				else if(j == dp[0].length - 1) {
					dp[i][j] = arr[i][j] + dp[i+1][j];
				}
				else {
					dp[i][j] = arr[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		
		return dp[0][0];
	}

}
