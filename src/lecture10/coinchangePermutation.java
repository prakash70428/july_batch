package lecture10;

import java.util.*;

public class coinchangePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int amount = scn.nextInt();
        System.out.println(ccp(arr,amount));
	}
	
	public static int ccp(int[] denoms,int amount) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;
		
		for(int i=1;i < dp.length;i++) {
			for(int j=0;j < denoms.length;j++) {
				int coin = denoms[j];
				if(i - coin >= 0) {
					dp[i] += dp[i - coin];
				}	
			}
		}
		
		return dp[dp.length - 1];
	}

}
