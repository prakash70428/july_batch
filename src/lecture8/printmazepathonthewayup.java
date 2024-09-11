package lecture8;
import java.util.*;
public class printmazepathonthewayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        printMazePaths(0,0,n - 1,m - 1 , "");
	}
	public static void printMazePaths(int sr,int sc,int dr,int dc,String asf) {
		if(sr > dr || sc > dc) {
			return;
		}
		if(sr == dr && sc == dc) {
			System.out.println(asf);
			return;
		}
		
		printMazePaths(sr , sc+1 , dr , dc , asf + "H");
		printMazePaths(sr+1 , sc , dr , dc , asf + "V");
	}

}
