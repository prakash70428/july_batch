package lecture1;
import java.util.*;
public class gcd_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();
	    
	    int div = n1;
	    int dvd = n2;
	    
	    while(dvd % div != 0) {
	    	int rem = dvd % div;
	    	dvd = div;
	    	div = rem;
	    }
	    
	    int gcd = div;
	    int lcm = (n1 * n2) / gcd;
	    
	    System.out.println("gcd: " + gcd);
	    System.out.println("lcm: " + lcm);
	}

}
