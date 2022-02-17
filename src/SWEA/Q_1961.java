package SWEA;

import java.util.Scanner;

public class Q_1961 {

	public static void main(String[] args) {
		// 숫자 배열 회전
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			
			// NxN 행렬 선언
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("#" + tc + " ");
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					System.out.print(turn(arr)[i][j]); // 90도 회전
				}
				System.out.print(" ");
				for(int j = 0; j<N; j++) {
					System.out.print(turn(turn(arr))[i][j]); // 180도 회전
				}
				System.out.print(" ");
				for(int j = 0; j<N; j++) {
					System.out.print(turn(turn(turn(arr)))[i][j]); //270도 회전
				}
				System.out.print("\n");
			}
		}

	}
	
	// 90도씩 회전하는 메소드
	public static int[][] turn(int[][] arr){
		int[][] arr_turn = new int[arr.length][arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0;j<arr.length; j++) {
				arr_turn[i][j] = arr[arr.length-j-1][i];
			}
		}
		return arr_turn;
		
	}

}
