package BAEKJOON;

import java.util.Scanner;

public class Q_11720 {

	public static void main(String[] args) {
		//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String x = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += x.charAt(i) -'0';
		}

		System.out.println(sum);
	}

}
