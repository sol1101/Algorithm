// ���� : �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է� : ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
/* ��� : ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
A�� B�� ���� ��쿡�� '=='�� ����Ѵ�. */
package BAEKJOON;

import java.util.Scanner;

public class Q_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
