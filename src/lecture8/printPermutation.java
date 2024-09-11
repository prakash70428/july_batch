package lecture8;
import java.util.*;
public class printPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printPermutation(str , "");
	}
	
	public static void printPermutation(String str,String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		for(int i=0 ;i < str.length();i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0 , i) + str.substring(i + 1);
			
			printPermutation(ros , asf + ch);
		}
	}

}
