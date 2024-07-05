package lecture2;
import java.util.*;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = n - 1;
        int star = 1;
        int val = 1;
        
        while(row <= n) {
        	//space
        	int i=1;
        	while(i <= space) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	//star
        	int j=1;
        	while(j <= star) {
        		System.out.print(val + " ");
        		j = j + 1;
        	}
        	//next row prepration
        	space = space - 1;
        	star = star + 2;
        	row = row + 1;
        	System.out.println();
        	val = val + 1;
        }
	}

}
