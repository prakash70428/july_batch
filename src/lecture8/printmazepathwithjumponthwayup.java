package lecture8;
import java.util.*;
public class printmazepathwithjumponthwayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int m = scn.nextInt();
	        
	     printMazePathswithjumps(0,0,n - 1,m - 1 , "");
	}

	public static void printMazePathswithjumps(int sr,int sc,int dr,int dc,String asf) {
		if(sr == dr && sc == dc) {
			System.out.println(asf);
			return;
		}
		
		for(int jump=1;jump <= dc - sc;jump++) {
			printMazePathswithjumps(sr , sc + jump,dr ,dc , asf + "h" + jump);
		}
		for(int jump=1;jump <= dr - sr;jump++) {
			printMazePathswithjumps(sr + jump, sc,dr ,dc , asf + "v" + jump);
		}
		for(int jump=1;jump <= dc - sc && jump <= dr - sr;jump++) {
			printMazePathswithjumps(sr + jump, sc + jump,dr ,dc , asf + "d" + jump);
		}
	}
}
