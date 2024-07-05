package lecture2;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = n - 1;
        int star = 1;
        
        while(row <= n) {
        	//spaces
        	int i = 1;
        	while(i <= space) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	
        	//star
        	int j=1;
        	while(j <= star) {
        		System.out.print("* ");
        		j = j + 1;
        	}
        	
        	//next row prepration
        	row = row + 1;
        	System.out.println();
        	space = space - 1;
        	star = star + 1;
        }
	}

}
