package SWEA;

import java.util.Scanner;

public class Q_2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			int arr[] = new int[10];
			int sum = 0;
			double avg = 0;
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			avg = Math.round(sum/arr.length);
			System.out.println("#" + test_case+ " "+(int) avg);

		}

	}

}
