package BAEKJOON;

import java.util.Scanner;

public class Q_1110 {

	public static void main(String[] args) {
		//���ϱ� ����Ŭ
		/*26���� �����Ѵ�. 2+6 = 8�̴�. 
		  ���ο� ���� 68�̴�. 6+8 = 14�̴�. 
		  ���ο� ���� 84�̴�. 8+4 = 12�̴�. 
		  ���ο� ���� 42�̴�. 4+2 = 6�̴�. 
		  ���ο� ���� 26�̴�.
		  ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.*/
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		int check = N;
		while(true) {
			N = ((N%10)*10) + (((N%10) + (N/10))%10);
			cnt ++;
			if(check == N) {
				break;
			}
		}System.out.println(cnt);

	}

}
