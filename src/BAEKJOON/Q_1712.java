package BAEKJOON;

import java.util.Scanner;

public class Q_1712 {

	public static void main(String[] args) {
		/* ��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�.
		 * ��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� ����� ���,
		 * �� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.
		 	A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 	 ���ʷ� ������ �߻��ϴ� �Ǹŷ��� ����Ѵ�*/

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); //�������
		int B = sc.nextInt(); //�������
		int C = sc.nextInt(); //����
		
		if(C-B <= 0) {
			System.out.println(-1);
		}else {
			System.out.println((A/(C-B)+1));
		}
		
		
	}

}
