package lecture5;

import java.util.*;

public class rotate_by_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[][] arr = new int[n][n];
	    //user input
	    for(int i=0;i < n;i++) {
	       for(int j=0; j < n;j++) {
	        	arr[i][j] = scn.nextInt();
	        }
	    }
	    
	    rotateby90(arr);
	    display(arr);
	}
	public static void rotateby90(int[][] arr) {
		//1. Take transpose
		for(int i=0 ;i < arr.length - 1;i++) {
			for(int j=i+1 ;j < arr[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//2. Re-arrange columns
		int left = 0;
		int right = arr[0].length - 1;
		while(left < right) {
			for(int row=0;row < arr.length;row++) {
				int temp = arr[row][left];
				arr[row][left] = arr[row][right];
				arr[row][right] = temp;
			}
			
			left++;
			right--;
		}
	}
	public static void display(int[][] arr) {
		for(int i=0 ;i < arr.length;i++) {
			for(int j=0 ; j < arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
