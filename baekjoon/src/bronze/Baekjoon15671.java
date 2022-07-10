package bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon15671 {
	static char color = 'B';
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] board = new char[6][6];
		setting(board);
		
		int N = sc.nextInt();
		int R = 0;
		int C = 0;
		
		for(int i=0; i<N; i++) {
			R = sc.nextInt();
			C = sc.nextInt();
			
			play(board, R, C);
		}
		
		resultPrint(board);
		
		sc.close();
	}
	
	public static void setting(char[][] board) {
		for(int i=0; i<board.length; i++) {
			for(int k=0; k<board[i].length; k++) {
				board[i][k] = '.';
			}
		}
		
		board[2][2] = 'W';
		board[2][3] = 'B';
		board[3][2] = 'B';
		board[3][3] = 'W';
	}
	
	public static void play(char[][] board, int R, int C) {
		List<String> change = new ArrayList<String>();
		
		// 놓은 돌 기준으로 8방향으로 돌 찾기.
		try {
			for(int i=0; i<6; i++) {
				if(board[R-1-i][C-1-i] == color) {
					change.add(Integer.toString(R-1-i) + "," + Integer.toString(C-1-i));
				}
				if(board[R-1-i][C-1] == color) {
					change.add(Integer.toString(R-1-i) + "," + Integer.toString(C-1));
				}
				if(board[R-1-i][C-1+i] == color) {
					change.add(Integer.toString(R-1-i) + "," + Integer.toString(C-1+i));
				}
				if(board[R-1][C-1+i] == color) {
					change.add(Integer.toString(R-1) + "," + Integer.toString(C-1+i));
				}
				if(board[R-1+i][C-1+i] == color) {
					change.add(Integer.toString(R-1+i) + "," + Integer.toString(C-1+i));
				}
				if(board[R-1+i][C-1] == color) {
					change.add(Integer.toString(R-1+i) + "," + Integer.toString(C-1));
				}
				if(board[R-1+i][C-1-i] == color) {
					change.add(Integer.toString(R-1+i) + "," + Integer.toString(C-1-i));
				}
				if(board[R-1][C-1-i] == color) {
					change.add(Integer.toString(R-1) + "," + Integer.toString(C-1-i));
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		// 놓은 돌
		board[R-1][C-1] = color;
		
		if(color != 'B') {
			color = 'B';
		} else {
			color = 'W';
		}
		
		resultPrint(board);
		System.out.println("====찾은돌 위치====");
		for(String str : change) {
			String[] index = str.split(",");
		}
		System.out.println("================");
	}
	
	public static void resultPrint(char[][] board) {
		System.out.println("==================");
		for(int i=0; i<board.length; i++) {
			for(int k=0; k<board[i].length; k++) {
				System.out.print(board[i][k]);
			}
			System.out.println();
		}
		
		System.out.println("==================");
	}
}
