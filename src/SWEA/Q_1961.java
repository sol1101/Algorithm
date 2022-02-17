package SWEA;

import java.util.Scanner;

public class Q_1961 {

	public static void main(String[] args) {
		// ���� �迭 ȸ��
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			
			// NxN ��� ����
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("#" + tc + " ");
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					System.out.print(turn(arr)[i][j]); // 90�� ȸ��
				}
				System.out.print(" ");
				for(int j = 0; j<N; j++) {
					System.out.print(turn(turn(arr))[i][j]); // 180�� ȸ��
				}
				System.out.print(" ");
				for(int j = 0; j<N; j++) {
					System.out.print(turn(turn(turn(arr)))[i][j]); //270�� ȸ��
				}
				System.out.print("\n");
			}
		}

	}
	
	// 90���� ȸ���ϴ� �޼ҵ�
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
