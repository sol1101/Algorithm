package BAEKJOON;

import java.util.Scanner;

public class Q_2231 {

	public static void main(String[] args) {
		// ������
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i<=n; i++) {
			int d = i;
			int sum = 0;
			
			while(d != 0) {
				sum += d % 10; //�ڸ��� ���ϱ�
				d /= 10;
			}
			
			// i���� �� �ڸ��� ���� ���� ���� ��� = ������
			if(sum +i == n) {
				result = i;
				break;
			}
		}System.out.println(result);

	}

}
