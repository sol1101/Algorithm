package BAEKJOON;

import java.util.Scanner;

public class Q_11729 {
	
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// 원판 옮기기	
		// 하노이 탑 원판 이동횟수 공식 참고
		// hanoi(n) = 2 * hanoi(n-1) + 1
		/* hanoi(1) = 1 , hanoi(n+1) = 2*hanoi(n) + 1
		 * hanoi(n+1) +1 = 2 * (hanoi(n) +1)
		 * a(n) = hanoi(n+1)일때
		 * a(n+1) = 2 * a(n)
		 * a(1) = hanoi(1) +1 = 2
		 * a(n) = hanoi(n) +1 = 2^n
		 * hanoi(n) = (2^n) -1 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sb.append(((int)Math.pow(2, n) -1)).append("\n");
		
		hanoi(n,1,2,3);
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int start, int mid, int finish) {
		if(n == 1) {
			sb.append(start + " " + finish + "\n");
			return;
		}
		
		// 1. n-1개를 start에서 mid로 이동
		hanoi(n-1,start,finish,mid);
		
		// 2. start에 남아있는 1개를 finish로 이동
		sb.append(start + " " + finish + "\n");
		
		// 3. n-1개를 다시 mid에서 finish로 이동
		hanoi(n-1, mid, start, finish);
	}

}
