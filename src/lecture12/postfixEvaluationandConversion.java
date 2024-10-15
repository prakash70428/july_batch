package lecture12;

import java.util.*;

public class postfixEvaluationandConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Stack<Integer> st1 = new Stack<>(); //evaluate
        Stack<String> st2 = new Stack<>(); //infix
        Stack<String> st3 = new Stack<>(); //prefix
        
        for(int i=0;i < str.length();i++) {
        	char ch = str.charAt(i);
        	
        	if(ch >= '0' && ch <= '9') {
        		st1.push(ch - '0');
        		st2.push(ch + "");
        		st3.push(ch + "");
        	}
        	else {
        		int op2 = st1.pop();
        		int op1 = st1.pop();
        		int ans = solve(op1,op2,ch);
        		st1.push(ans);
        		
        		String o2 = st2.pop();
        		String o1 = st2.pop();
        		st2.push("(" + o1 + ch + o2 + ")");
        		
        		String opp2 = st3.pop();
        		String opp1 = st3.pop();
        		st3.push(ch + opp1 + opp2);
        	}
        }
        
        System.out.println("evaluate:" + st1.pop());
        System.out.println("infix:" + st2.pop());
        System.out.println("prefix:" + st3.pop());
	}
	
	public static int solve(int op1,int op2,char oprtr) {
		if(oprtr == '+') {
			return op1 + op2;
		}
		else if(oprtr == '-') {
			return op1 - op2;
		}
		else if(oprtr == '*') {
			return op1 * op2;
		}
		else {
			return op1 / op2;
		}
	}

}
