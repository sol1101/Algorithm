package BAEKJOON;

import java.util.Scanner;

public class Q_2675 {

	public static void main(String[] args) {
		//���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j = 0; j<S.length(); j++) {
				for(int k = 0; k<R; k++) {
					System.out.print(S.charAt(j));
					
				}
			}System.out.println();
		}
	}

}
