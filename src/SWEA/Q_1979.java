package SWEA;

import java.util.Scanner;

public class Q_1979 {

	public static void main(String[] args) {
		// 단어 퍼즐
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 퍼즐의 길이
			int K = sc.nextInt(); // 단어의 길이
			int sum = 0;

			int puzzle[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				int check_row = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[i][j] == 1) {
						check_row++;
					}else {
						if(check_row == K) sum ++;
						check_row = 0;
					}

				}
				if(check_row == K) sum ++;

			}

			for (int i = 0; i < N; i++) {
				int check_column = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[j][i] == 1) {
						check_column++;
					}else {
						if(check_column == K) sum ++;
						check_column = 0;
					}
					
				}
				if(check_column == K) sum ++;
				
			}


			System.out.println("#" + tc + " " + sum);
		}

	}
}
