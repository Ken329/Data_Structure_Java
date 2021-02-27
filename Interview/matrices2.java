package Interview;
import java.util.*;
import java.util.Arrays;
public class matrices2 {
	public void cal(int row, int col, int select, int[][] fir, int[][] sec){
		int[][] cal = new int[row][col];
		int flag = 0;
		switch(select) {
		case 1:
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					cal[i][j] = fir[i][j] + sec[i][j];
				}
			}
			flag = 1;
			break;
		case 2:
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					cal[i][j] = fir[i][j] - sec[i][j];
				}
			}
			flag = 1;
			break;
		case 3:
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					cal[i][j] = fir[i][j] + sec[i][j];
				}
			}
			flag = 1;
			break;
		case 4:
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					cal[i][j] = fir[i][j] + sec[i][j];
				}
			}
			flag = 1;
			break;
		}
		if(flag == 1) {
			for(int i = 0 ; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.print(cal[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Error!!! Invalid operator");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many rows :");
		int row = input.nextInt();
		System.out.print("How many columns :");
		int col = input.nextInt();
		
		int[][] firnum = new int[row][col];
		int[][] secnum = new int[row][col];
		int[][] ans = new int[row][col];
		
		System.out.println("Enter your first matrice :");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				firnum[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter your second matrice :");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				secnum[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				ans[i][j] = firnum[i][j] + secnum[i][j];
			}
		}
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.print("Choose your operator : ");
		int op = input.nextInt();
		matrices2 m2 = new matrices2();
		m2.cal(row, col, op, firnum, secnum);
	}

}
