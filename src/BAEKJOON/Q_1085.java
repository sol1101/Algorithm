package BAEKJOON;

import java.util.Scanner;

public class Q_1085 {

	public static void main(String[] args) {
		/* �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�,
		 * ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�.
		 * ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
	
		int short_x = Math.min((w-x), x);
		int short_y = Math.min((h-y), y);
		
		System.out.println(Math.min(short_x, short_y));
			
		
	}

}
