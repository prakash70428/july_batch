package lecture7;

import java.util.*;

public class getmazepathwithjump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMathPathswithjumps(0,0,n - 1,m - 1));
	}
	
	public static ArrayList<String> getMathPathswithjumps(int sr,int sc, int dr,int dc){
		if(sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		for(int jump=1; jump <= dc - sc ;jump++) {
			ArrayList<String> rr = getMathPathswithjumps(sr,sc + jump,dr,dc);
			for(int i=0; i < rr.size();i++) {
				mr.add("h" + jump + rr.get(i));
			}
		}
		
		for(int jump=1; jump <= dr - sr ;jump++) {
			ArrayList<String> rr = getMathPathswithjumps(sr + jump,sc,dr,dc);
			for(int i=0; i < rr.size();i++) {
				mr.add("v" + jump + rr.get(i));
			}
		}
		
		for(int jump=1;jump <= dc - sc && jump <= dr - sr ;jump++) {
			ArrayList<String> rr = getMathPathswithjumps(sr + jump,sc + jump,dr,dc);
			for(int i=0; i < rr.size();i++) {
				mr.add("d" + jump + rr.get(i));
			}
		}
		
		return mr;
	}

}
