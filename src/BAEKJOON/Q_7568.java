package BAEKJOON;

import java.util.Scanner;

public class Q_7568 {

	public static void main(String[] args) {
		// ��ġ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ��ü ����� ��
		int wh[][] = new int[N][2]; // �����Կ� Ű �迭
		for (int i = 0; i < N; i++) {
			wh[i][0] = sc.nextInt(); // ������
			wh[i][1] = sc.nextInt(); // Ű
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
