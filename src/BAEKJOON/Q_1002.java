package BAEKJOON;

import java.util.Scanner;

public class Q_1002 {

	public static void main(String[] args) {
		// �ͷ�
		/* �� ���� �߽� ������ �Ÿ��� ���Ѵ� (�� �� ������ �Ÿ�)
		 * �� ���� ���ϸ� 1 ���
		 * �� ���� �� ������ ������ 2���
		 * ������ ������ 0���
		 * �߽���ǥ�� �������� ��� �����ϸ� ���Ѵ�� �����⶧���� -1 ���*/
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int x1 = sc.nextInt(); int y1 = sc.nextInt(); int r1 = sc.nextInt();
			int x2 = sc.nextInt(); int y2 = sc.nextInt(); int r2 = sc.nextInt();
			
			double d = Math.sqrt((Math.pow((x1-x2), 2)) + Math.pow((y1-y2), 2));
			
			if(x1==x2 && y1==y2 && r1==r2) System.out.println("-1");
			
			else if(d<(r1+r2) && Math.abs(r1-r2)<d) System.out.println("2");
			
			else if(d==(r1+r2) || Math.abs(r1-r2) == d)System.out.println("1");
			
			else if(d>(r1+r2) || Math.abs(r1-r2)>d) System.out.println("0");
		}
		
		

	}

}
