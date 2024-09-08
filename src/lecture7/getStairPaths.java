package lecture7;
import java.util.*;
public class getStairPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMathPaths(0,0,n - 1,m - 1));
	}
	
	public static ArrayList<String> getMathPaths(int sr,int sc,int dr,int dc){
		if(sr > dr || sc > dc) {
			ArrayList<String> bans = new ArrayList<>();
			return bans;
		}
		if(sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		
		ArrayList<String> rr1 = getMathPaths(sr,sc + 1,dr,dc);
		ArrayList<String> rr2 = getMathPaths(sr + 1,sc,dr,dc);
		
		ArrayList<String> mr = new ArrayList<>();
		for(int i=0 ;i < rr1.size();i++) {
			mr.add("H" + rr1.get(i));
		}
		for(int i=0 ;i < rr2.size();i++) {
			mr.add("V" + rr2.get(i));
		}
		
		return mr;
	}

}
