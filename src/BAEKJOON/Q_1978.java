package BAEKJOON;

import java.util.Scanner;

public class Q_1978 {

	public static void main(String[] args) {
		// 주어진 수들 중 소수의 개수를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //숫자의 갯수
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			int x = sc.nextInt();
			boolean check = true;
			
			if(x==1) {
				continue;
			}
			for(int j = 2; j<=Math.sqrt(x); j++){
				if(x%j == 0) {
					check = false;
				}
			}
			if(check == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
