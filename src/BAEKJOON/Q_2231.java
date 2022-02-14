package BAEKJOON;

import java.util.Scanner;

public class Q_2231 {

	public static void main(String[] args) {
		// 분해합
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i<=n; i++) {
			int d = i;
			int sum = 0;
			
			while(d != 0) {
				sum += d % 10; //자릿수 더하기
				d /= 10;
			}
			
			// i값과 각 자릿수 누적 합이 같을 경우 = 생성자
			if(sum +i == n) {
				result = i;
				break;
			}
		}System.out.println(result);

	}

}
