package BAEKJOON;

import java.util.Scanner;

public class Q_2941 {

	public static void main(String[] args) {
		// ũ�ξ�Ƽ�� ���ĺ� ã��
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] word = {"c=", "c-","dz=","d-", "lj", "nj", "s=", "z="}; //���ڿ� ���

		for(int i = 0; i<word.length;i++) {
			if(s.contains(word[i])) {
				s = s.replaceAll(word[i], "1");
			}
		}
		System.out.println(s.length());
	}
}
