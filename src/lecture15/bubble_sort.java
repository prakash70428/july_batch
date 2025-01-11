package lecture15;

import java.util.*;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        bubbleSort(arr);
        display(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int itr=1 ;itr <= n-1;itr++) {
			for(int i=0 ;i <= n-itr-1;i++) {
				if(isSmaller(arr,i+1,i) == true) {
					swap(arr,i+1,i);
				}
			}
		}
	}
	//used for swapping ith and jth elements of an array
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//return true if ith element is smaller than jth element
	public static boolean isSmaller(int[] arr,int i,int j) {
		if(arr[i] < arr[j]) {
			return true;
		}else {
			return false;
		}
	}
	public static void display(int[] arr) {
		for(int i=0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
