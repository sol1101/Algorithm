package BAEKJOON;

import java.util.Scanner;

public class Q_2292 {

	public static void main(String[] args) {
		/* ���������� �̷���� ������ �ִ�.
		 * �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�.
		 * ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� ��
		 * �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

		// 2~7 -> 2��° �� (6��)
		// 8~19 -> 3��° �� (12��)
		// 20~37 -> 4��° �� (18��)

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int i = 2;
		int cnt = 1; //�ּҰŸ�
		
		while(i<=N) {
			i = i + (6*cnt);
			cnt++;
		}System.out.println(cnt);
	}

}
