package SWEA;

import java.util.Scanner;

public class Q_1954 {

	public static void main(String[] args) {
		// ������ ����
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			arr[0][0] = 1;
			int cnt = 1;
			int step = N - 1;
			int x = 0;
			int y = 0;

			while (true) {
				if (cnt == N * N)
					break;

				// �� ä���
				if (cnt == 1) {
					for (int i = 0; i < step; i++) {
					y++;
					cnt++;
					arr[x][y] = cnt;
					}
				}

				// ������ ä���
				for (int i = 0; i < step; i++) {
					x++;
					cnt++;
					arr[x][y] = cnt;
				}

				// �Ʒ� ä���
				for (int i = 0; i < step; i++) {
					y--;
					cnt++;
					arr[x][y] = cnt;
				}
				step--;

				// ���� ä���
				for (int i = 0; i < step; i++) {
					x--;
					cnt++;
					arr[x][y] = cnt;
				}

				// ���� ä���
				for (int i = 0; i < step; i++) {
					y++;
					cnt++;
					arr[x][y] = cnt;
				}
				step--;
			}

			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
