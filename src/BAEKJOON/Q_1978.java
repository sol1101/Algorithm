package BAEKJOON;

import java.util.Scanner;

public class Q_1978 {

	public static void main(String[] args) {
		// �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //������ ����
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			int x = sc.nextInt();
			boolean check = true;
			
			if(x==1) {
				continue;
			}
			for(int j = 2; j<=Math.sqrt(x); j++){
				if(x%j == 0) {
					check = false;
				}
			}
			if(check == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
