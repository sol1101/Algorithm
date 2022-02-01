package BAEKJOON;

import java.util.Scanner;

public class Q_2775 {

	public static void main(String[] args) {
		/* a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ�
		 * �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�.
		 * ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
		 * ù ��° �ٿ� Test case�� �� T�� �־�����. �׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ���� n�� �־�����*/

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //�׽�Ʈ���̽�
		
		int [][] A = new int [15][15];
		
		for(int i = 0; i<T; i++) {
			int k = sc.nextInt(); //����
			int n = sc.nextInt(); //ȣ	
			System.out.println(cntPeople(k, n));
			
		}
		
		
	}
	public static int cntPeople(int k, int n) {
		int cnt = 0;
		if(k==1) {
			for(int i = 1; i<=n; i++) {
				cnt += i;
			}
		}
		else {
			for(int i = 1; i<=n; i++) {
				cnt += cntPeople(k-1, i);
			}
		}
		return cnt;
	}

}
