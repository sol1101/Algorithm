package BAEKJOON;

import java.util.Scanner;

public class Q_10250 {

	public static void main(String[] args) {
		/*  102 ȣ �溸�ٴ� 301 ȣ ���� �� ��ȣ�ϴµ�,
		 * 102 ȣ�� �Ÿ� 2 ��ŭ �ɾ�� ������ 301 ȣ�� �Ÿ� 1 ��ŭ�� ������ �Ǳ� �����̴�.
		 * ���� ������ 102 ȣ���� 2101 ȣ�� �� ��ȣ�Ѵ�.
		 * ���α׷��� �Է��� T ���� �׽�Ʈ �����ͷ� �̷���� �ִµ� T �� �Է��� �� ù �ٿ� �־�����.
		 * �� �׽�Ʈ �����ʹ� �� �����μ� H, W, N, �� ������ �����ϰ� ������
		 * ���� ȣ���� �� ��, �� ���� �� ��, �� ��° �մ������� ��Ÿ���� */

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // �׽�Ʈ���̽�

		for(int i = 0; i<T; i++) {
			int H = sc.nextInt(); // ȣ���� �� ��
			int W = sc.nextInt(); // �� ���� �� ��
			int N = sc.nextInt(); // �� ��° �մ�����
			
			if(N%H == 0) {
				System.out.println((H*100) + (N/H));
			}else {
				System.out.println(((N%H)*100) + ((N/H) + 1));
				
			}
			
			
			
			
		}
		
	}

}
