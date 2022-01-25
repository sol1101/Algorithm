package BAEKJOON;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_1152 {

	public static void main(String[] args) {
		// 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); //공백 포함 문자열을 입력받아야하므로 nextLine
		
		StringTokenizer st = new StringTokenizer(s," "); // 공백을 기준으로 토큰을 나눠줌
		
		System.out.println(st.countTokens());

	}

}
