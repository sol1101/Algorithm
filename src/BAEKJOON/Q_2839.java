package BAEKJOON;

import java.util.Scanner;

public class Q_2839 {

	public static void main(String[] args) {
		/*
		 * 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ� �� ���� ������
		 * ������ ����� �� �ִ�. ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷���
		 * �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		while (true) {
			if(N%5 == 0) {
				cnt += N/5;
				break;
			}else {
				N -= 3;
				cnt ++;
			}
			if(N<0) {
				cnt = -1;
				break;
			}

		}System.out.println(cnt);

	}
}