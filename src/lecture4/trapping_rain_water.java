package lecture4;

import java.util.*;

public class trapping_rain_water {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int ans = trappingwater(arr);
        System.out.println(ans);
	}
	
	public static int trappingwater(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i=1 ;i < n;i++) {
			left[i] = Math.max(left[i - 1],arr[i]);
		}
		
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for(int i=n-2;i >= 0;i--) {
			right[i] = Math.max(right[i + 1],arr[i]);
		}
		
		int sum = 0;
		for(int i=0 ; i < n;i++) {
			sum = sum + Math.min(left[i],right[i]) - arr[i];
		}
		
		return sum;
	}

}
