package BAEKJOON;

import java.util.Scanner;

public class Q_1157 {

	public static void main(String[] args) {
		//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����,
		//�� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
		//ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�.
		//��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; //���Ĺ� �迭
		String S = sc.next().toUpperCase(); //�ܾ� �Է�
		int max = 0; //���� ���� ���� ����
		char result = ' ';
		
		for(int i = 0; i<S.length(); i++) {
			arr[S.charAt(i)-'A']++; //�Է¹��� �ܾ� �� �ش� ���ĺ� ī��Ʈ
		}
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				result = (char)(i+'A');
			}else if(max == arr[i]) {
				result ='?';
			}
		}System.out.println(result);
	}


}
