package lecture9;
import java.util.*;
public class targetsumsubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,target);
	}
	public static void printTargetSumSubsets(int[] arr,int idx,String asf,int ssf,int tar) {
		if(ssf > tar) {
			return;
		}
		
		if(idx == arr.length) {
			if(ssf == tar) {
				System.out.println(asf + ",");
			}
			return;
		}
		
		//yes
		printTargetSumSubsets(arr,idx+1,asf+arr[idx]+",",ssf+arr[idx],tar);
		//no
		printTargetSumSubsets(arr,idx+1,asf,ssf,tar);
	}

}
