package lecture7;
import java.util.*;
public class all_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        int[] sol =  allIndices(arr,0,0,x);
        for(int i=0;i < sol.length;i++) {
        	System.out.println(sol[i]);
        }
	}
	
	public static int[] allIndices(int[] arr,int idx,int fsf,int x) {
		if(idx == arr.length) {
			int[] ans = new int[fsf];
			return ans;
		}
		
		if(arr[idx] == x) {
			fsf++;
		}
		int[] rr = allIndices(arr,idx+1,fsf,x);
		if(arr[idx] == x) {
			rr[fsf - 1] = idx;
		}
		
    	return rr;
		
	}

}
