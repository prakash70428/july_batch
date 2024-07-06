package lecture4;
import java.util.*;
public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
//        arr[0] = scn.nextInt();
//        arr[1] = scn.nextInt();
//        arr[2] = scn.nextInt();
//        arr[3] = scn.nextInt();
        
        for(int i=0;i < n;i++) {
        	System.out.println(arr[i]);
        }
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        
	}

}
