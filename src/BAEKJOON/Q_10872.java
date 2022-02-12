package BAEKJOON;

import java.util.Scanner;

public class Q_10872 {

	public static void main(String[] args) {
		// ÆÑÅä¸®¾ó
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p = 1;
		for(int i = 1; i<=N; i++) {
			p *= i;
		}
		System.out.println(p);
		
		
	}

}
