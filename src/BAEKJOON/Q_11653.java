package BAEKJOON;

import java.util.Scanner;

public class Q_11653 {

	public static void main(String[] args) {
		// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 2;
		
		while(i<=N) {
			if(N%i == 0) {
				N /=i;
				System.out.println(i);
			}else {
				i++;
			}
		}

	}

}
