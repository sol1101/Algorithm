package SWEA;

import java.util.Scanner;

public class Q_2050 {

	public static void main(String[] args) {
		// 알파벳을 숫자로 변환
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++) {
			System.out.print((int)s.charAt(i)-64 + " ");
		}

	}

}
