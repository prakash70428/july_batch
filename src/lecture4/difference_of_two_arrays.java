package lecture4;
import java.util.*;
public class difference_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0 ;i < n1;i++) {
        	arr1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0 ;i < n2;i++) {
        	arr2[i] = scn.nextInt();
        }
        
        int[] ans = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int borrow = 0;
        
        while(k >= 0) {
        	int diff = (arr2[j] - borrow);
        	if(i >= 0) {
        		diff = diff - arr1[i];
        	}
        	
        	if(diff >= 0) {
        		borrow = 0;
        	}else {
        		diff = diff + 10;
        		borrow = 1;
        	}
        	ans[k] = diff;
        	
        	i--;
        	j--;
        	k--;
        }
        
        
        i = 0;
        while(ans[i] == 0) {
        	i++;
        }
        
        for( ;i < ans.length;i++) {
        		System.out.println(ans[i]);		
        }
	}

}
