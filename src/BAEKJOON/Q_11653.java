package BAEKJOON;

import java.util.Scanner;

public class Q_11653 {

	public static void main(String[] args) {
		// ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�
		
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
