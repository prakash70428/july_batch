package lecture2;
import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int space = n-1;
        int star = 1;

        while (row<=n)
        {
            //spaces
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i=i+1;
            }

            //stars
            int j=1;
            while(j<=star)
            {
            	if(j % 2 == 0) {
            		 System.out.print("! ");
            	}else {
            		 System.out.print("* ");
            	}
               
                j=j+1;
            }
            
          //next row preparation
            row=row+1;
            space=space-1;
            star=star+2;
            System.out.println();
	}
 }

}
