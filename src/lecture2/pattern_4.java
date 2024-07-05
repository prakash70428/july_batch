package lecture2;
import java.util.*;
public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = 0;
        int star = n;
        
        while(row <= 2*n - 1) {
        	//space
        	int i = 1;
        	while(i <= space) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	
        	//star 
        	int j = 1;
        	while(j <= star) {
        		System.out.print("* ");
        		j = j + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n) {
        		space = space + 2;
        		star = star - 1;
        	}else {
        		space = space - 2;
        		star = star + 1;
        	}
        	
        	row = row + 1;
        	System.out.println();
        }
	}

}
