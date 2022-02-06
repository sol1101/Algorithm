package BAEKJOON;

import java.util.Scanner;

public class Q_9020 {
	public static void main(String[] args) {
		// 골드바흐의 추측
		Scanner sc = new Scanner(System.in);
		
		boolean prime[]  = new boolean[10001];
		prime[0] = prime[1] = true;
		for(int i = 2; i<(int)Math.sqrt(prime.length); i++) {
			if(prime[i] == true) continue;
			
			for(int j = i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
		int T = sc.nextInt(); //테스트케이스
		while(T>0) {
			int n = sc.nextInt(); //짝수 입력
			int a = n/2;
			int b = n/2;
			
			while(true) {
				if(prime[a] ==false && prime[b] == false) {
					System.out.println(a + " " + b);
					break;
			}a --; b ++;
			}
			
			T--;
		}

	}

}
