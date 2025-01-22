package lecture15;

import java.util.Scanner;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int[] sol = mergeSort(arr,0,arr.length-1);
        for(int i=0;i < sol.length;i++) {
        	System.out.println(sol[i]);
        }
	}
	
	public static int[] mergeSort(int[] arr,int left,int right) {
		if(left == right) {
			int[] bans = new int[1];
			bans[0] = arr[left];
			return bans;		
		}
		
		int mid = (left + right) / 2;
		int[] fsh = mergeSort(arr,left,mid);
		int[] ssh = mergeSort(arr,mid+1,right);
		int[] ans = mergeTwoSortedArray(fsh,ssh);
		return ans;
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
