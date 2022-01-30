package BAEKJOON;

import java.util.Scanner;

public class Q_2941 {

	public static void main(String[] args) {
		// 크로아티아 알파벳 찾기
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] word = {"c=", "c-","dz=","d-", "lj", "nj", "s=", "z="}; //문자열 등록

		for(int i = 0; i<word.length;i++) {
			if(s.contains(word[i])) {
				s = s.replaceAll(word[i], "1");
			}
		}
		System.out.println(s.length());
	}
}
