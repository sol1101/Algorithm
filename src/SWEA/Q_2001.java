package SWEA;

import java.util.Scanner;

public class Q_2001 {

	public static void main(String[] args) {
		// 파리퇴치
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int table[][] = new int[N][N];
			int max = 0;
			
			for(int i = 0;i<N;i++) {
				for(int j = 0; j<N; j++) {
					table[i][j] = sc.nextInt();
				}
			}
			
			// MxM크기의 박스로 NxN크기의 박스를 완전탐색
			for(int i = 0; i<=N-M; i++) {
				for(int j = 0; j<=N-M; j++) {
					int sum = 0;
					
					//MxM박스의 숫자들의 합을 구함
					for(int a = i;a<M+i; a++) {
						for(int b = j; b<M+j; b++) {
							sum += table[a][b];
						}
					}
					if(max<sum) max=sum;
				}
			}
			
			System.out.println("#" + tc + " " + max);
			
			
		}

	}

}
