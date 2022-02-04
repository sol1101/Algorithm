package BAEKJOON;

import java.util.Scanner;

public class Q_2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = N;
		
		for(int i = M; i<=N; i++) {
			boolean check = true;
			if(i == 1) check = false;
			
			for(int j = 2; j<=(int)Math.sqrt(i); j++) {
				if(i%j == 0) check = false;
				}
			
			if(check == true) {
				System.out.println(i);
				sum+=i;
				if(min==N) min = i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}

	}

}
