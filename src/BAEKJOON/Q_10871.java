package BAEKJOON;

import java.util.Scanner;

public class Q_10871 {

	public static void main(String[] args) {
		//N���� ���ڷ� �̷���� �迭 A���� X���� ���� ���� ��� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int A[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
