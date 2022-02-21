package SWEA;

import java.util.Scanner;

public class Q_1974 {

	public static void main(String[] args) {
		// 스도쿠 검증
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result = 1;
			int table[][] = new int[9][9];

			// 스도쿠 입력
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					table[i][j] = sc.nextInt();
				}
			}

			// row 체크
			for (int i = 0; i < 9; i++) {
				int sum = 0;
				for (int j = 0; j < 9; j++) {
					sum += table[i][j];
				}
				if (sum != 45) {
					result = 0;
					break;
				}
			}

			// column 체크
			for (int i = 0; i < 9; i++) {
				int sum = 0;
				for (int j = 0; j < 9; j++) {
					sum += table[j][i];
				}
				if (sum != 45) {
					result = 0;
					break;
				}
			}

			// 9개의 칸 각각 체크
			for (int i = 0; i <= 6; i+=3) {
				for (int j = 0; j <= 6; j+=3) {
					int sum = 0;
					for (int a = 0; a < 3; a++) {
						for (int b = 0; b < 3; b++) {
							sum += table[i + a][j + b];
						}
					}

					if (sum != 45) {
						result = 0;
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}

	}

}
