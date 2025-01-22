package lecture15;

import java.util.*;

public class merge_two_sorted_array {

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
        
        int[] sol = mergeTwoSortedArray(arr1,arr2);
        for(int i=0;i < sol.length;i++) {
        	System.out.println(sol[i]);
        }
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			}else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		
		return ans;
	}

}
