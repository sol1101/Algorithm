package BAEKJOON;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_1152 {

	public static void main(String[] args) {
		// ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); //���� ���� ���ڿ��� �Է¹޾ƾ��ϹǷ� nextLine
		
		StringTokenizer st = new StringTokenizer(s," "); // ������ �������� ��ū�� ������
		
		System.out.println(st.countTokens());

	}

}
