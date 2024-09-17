package lecture9;
import java.util.*;
public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chess = new boolean[n][n];
        PrintNQueens(chess,"",0);
	}
	
	public static void PrintNQueens(boolean[][] chess,String asf,int row) {
		if(row == chess.length) {
			System.out.println(asf + ".");
			return;
		}
		
		for(int col=0;col < chess.length;col++) {
			if(isItSafe(chess,row,col) == true) {
				chess[row][col] = true; //place the queen
				PrintNQueens(chess, asf+row+"-"+col+"," ,row+1);
				chess[row][col] = false; //unplace the queen
			}
		}
	}
	
	public static boolean isItSafe(boolean[][] chess,int row,int col) {
		//check in column
		for(int i=row-1;i >= 0;i--) {
			if(chess[i][col] == true) {
				return false;
			}
		}
		//check in d1
		for(int i=row-1,j=col+1;i >=0 && j < chess.length;i--,j++) {
			if(chess[i][j] == true) {
				return false;
			}
		}
		//check in d2
		for(int i=row-1,j=col-1;i >=0 && j >= 0;i--,j--) {
			if(chess[i][j] == true) {
				return false;
			}
		}
		
		return true;
	}

}
