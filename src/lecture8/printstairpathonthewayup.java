package lecture8;
import java.util.*;
public class printstairpathonthewayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    
	    printStairPaths(n , "");
	}
	
	public static void printStairPaths(int n , String asf) {
		if(n == 0) {
			System.out.println(asf);
			return;
		}
		if(n < 0) {
			return;
		}
		
		printStairPaths(n - 1 , asf + "1");
		printStairPaths(n - 2 , asf + "2");
		printStairPaths(n - 3 , asf + "3");
	}

}
