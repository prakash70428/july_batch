package lecture8;
import java.util.*;
public class printkpconthewayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     String str = scn.nextLine();
	     
	     printKPC(str , "");
	}
	
	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printKPC(String str,String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		String code = arr[ch - '0'];
		for(int i = 0 ;i < code.length();i++) {
			char c = code.charAt(i);
			printKPC(ros , asf + c);
		}
	}

}
