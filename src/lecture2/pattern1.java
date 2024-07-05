package lecture2;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = n;
        
        while(row <= n) {
        	//star
        	int i = 1;
        	while(i <= star) {
        		System.out.print("* ");
        		i = i + 1;
        	}
        	
        	//next row prepration
        	row = row + 1;
        	System.out.println();
        }
	}

}
