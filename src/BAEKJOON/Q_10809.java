package BAEKJOON;

import java.util.Scanner;

public class Q_10809 {

	public static void main(String[] args) {
		/*���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
		�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
		���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int[] arr = new int[26];

		for(char c = 'a'; c<='z'; c++) {
			System.out.print(S.indexOf(c) + " ");
		}

	}

}
