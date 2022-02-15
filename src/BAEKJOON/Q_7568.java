package BAEKJOON;

import java.util.Scanner;

public class Q_7568 {

	public static void main(String[] args) {
		// 덩치
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 전체 사람의 수
		int wh[][] = new int[N][2]; // 몸무게와 키 배열
		for (int i = 0; i < N; i++) {
			wh[i][0] = sc.nextInt(); // 몸무게
			wh[i][1] = sc.nextInt(); // 키
		}

		for (int i = 0; i < N; i ++) {
			int r = 1;
			for (int j = 0; j <N ; j ++) {
				if (wh[i][0] < wh[j][0] && wh[i][1] < wh[j][1]) r++;
			}
			System.out.print(r + " ");
		}
	}

}
