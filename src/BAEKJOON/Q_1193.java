package BAEKJOON;

import java.util.Scanner;

public class Q_1193 {

	public static void main(String[] args) {
		// �м����ϱ�

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int line = 1;
		int cnt = 0;
		
		// X�� ���° ���ο� �ִ���
		while(true) {
			if(cnt+line>=X) {
				break;
			}
			cnt += line;
			line ++;
		}
		int result = X -cnt;
		
		if(line %2 == 1) {
			System.out.println((line - result +1) + "/" + result);
		}else {
			System.out.println((result + "/" + (line-result+1)));
		}
	}

}
