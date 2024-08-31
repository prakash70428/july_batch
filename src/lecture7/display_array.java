package lecture7;
import java.util.*;
public class display_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        displayArray(arr,0);
	}
	
	public static void displayArray(int[] arr,int idx) {
		if(idx == arr.length) {
			return ;
		}
		
		System.out.println(arr[idx]);
		displayArray(arr,idx + 1);
	}

}
