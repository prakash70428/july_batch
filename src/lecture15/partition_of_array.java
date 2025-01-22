package lecture15;

import java.util.*;

public class partition_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int pivot = scn.nextInt();
        partition(arr,pivot);
	}
	
	public static void partition(int[] arr,int pivot) {
		int i = 0;
		int j = 0;
		
		while(i < arr.length) {
			if(arr[i] <= pivot) {
				swap(arr,i,j);
				i++;
				j++;
			}else {
				i++;
			}
		}		
	}

}
