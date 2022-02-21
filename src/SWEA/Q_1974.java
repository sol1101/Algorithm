package SWEA;

import java.util.Scanner;

public class Q_1974 {

	public static void main(String[] args) {
		// ������ ����
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result = 1;
			int table[][] = new int[9][9];

			// ������ �Է�
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					table[i][j] = sc.nextInt();
				}
			}

			// row üũ
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

			// column üũ
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

			// 9���� ĭ ���� üũ
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
