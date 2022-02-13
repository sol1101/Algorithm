package BAEKJOON;

import java.util.Scanner;

public class Q_11729 {
	
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// ���� �ű��	
		// �ϳ��� ž ���� �̵�Ƚ�� ���� ����
		// hanoi(n) = 2 * hanoi(n-1) + 1
		/* hanoi(1) = 1 , hanoi(n+1) = 2*hanoi(n) + 1
		 * hanoi(n+1) +1 = 2 * (hanoi(n) +1)
		 * a(n) = hanoi(n+1)�϶�
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
		
		// 1. n-1���� start���� mid�� �̵�
		hanoi(n-1,start,finish,mid);
		
		// 2. start�� �����ִ� 1���� finish�� �̵�
		sb.append(start + " " + finish + "\n");
		
		// 3. n-1���� �ٽ� mid���� finish�� �̵�
		hanoi(n-1, mid, start, finish);
	}

}
