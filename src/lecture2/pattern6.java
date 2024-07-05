package lecture2;
import java.util.*;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = n/2 + 1;
        int space = -1;
        
        while(row <= n) {
        	//star
        	int i = 1;
        	while(i <= star) {
        		System.out.print("* ");
        		i = i + 1;
        	}
        	//space
        	int j = 1;
        	while(j <= space) {
        		System.out.print("  ");
        		j = j + 1;
        	}
        	//star
        	int k = 1;
        	if(row == 1 || row == n) {
        		k = 2;
        	}
        	while(k <= star) {
        		System.out.print("* ");
        		k = k + 1;
        	}
        	//next row prepration
        	//mirror concept
        	if(row < n/2 + 1) {
        		star = star - 1;
        		space = space + 2;
        	}else {
        		star = star + 1;
        		space = space - 2;
        	}
        	row= row + 1;
        	System.out.println();
        }
	}

}
