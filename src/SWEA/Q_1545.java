package SWEA;

import java.util.Scanner;

public class Q_1545 {

	public static void main(String[] args) {
		// 거꾸로 출력하기
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = N; i>=0; i--) {
			System.out.print(N + " ");
			N--;
		}
	}

}
