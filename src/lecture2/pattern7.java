package lecture2;
import java.util.*;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space1 = n/2;
        int space2 = -1; //between space
        
        while(row <= n) {
        	//space1
        	int i = 1;
        	while(i <= space1) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	//single star
        	System.out.print("* ");
        	//between space
        	int j = 1;
        	while(j <= space2) {
        		System.out.print("  ");
        		j = j + 1;
        	}
        	//single star
        	if(row >= 2 && row < n) {
        		System.out.print("* ");
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n/2 + 1) {
        		space1 = space1 - 1;
        		space2 = space2 + 2;
        	}else {
        		space1 = space1 + 1;
        		space2 = space2 - 2;
        	}
        	
        	row = row + 1;
        	System.out.println();
        }
	}

}
