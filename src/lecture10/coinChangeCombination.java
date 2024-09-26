package lecture10;
import java.util.*;
public class coinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int amount = scn.nextInt();
        System.out.println(ccc(arr,amount));
	}
	
	public static int ccc(int[] denoms,int amount) {
		int[] dp = new int[amount+1];
		dp[0] = 1;//amount 0 can be paid in one way
		
		for(int i=0 ;i < denoms.length;i++) {
			int coin = denoms[i];
			
			for(int j=1;j < dp.length;j++) {
				if(j - coin >= 0) {
					dp[j] += dp[j - coin];
				}	
			}
		}
		
		return dp[amount];
	}

}
