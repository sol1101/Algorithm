package BAEKJOON;

import java.util.Scanner;

public class Q_2908 {

	public static void main(String[] args) {
		/*����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�.
		 ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
		  ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
		  �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		StringBuffer sbA = new StringBuffer().append(A);
		StringBuffer sbB = new StringBuffer().append(B);
		
		A = Integer.parseInt(sbA.reverse().toString());
		B = Integer.parseInt(sbB.reverse().toString());
		
		System.out.println(A > B ? A : B);
	}

}
