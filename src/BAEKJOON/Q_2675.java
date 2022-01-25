package BAEKJOON;

import java.util.Scanner;

public class Q_2675 {

	public static void main(String[] args) {
		//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j = 0; j<S.length(); j++) {
				for(int k = 0; k<R; k++) {
					System.out.print(S.charAt(j));
					
				}
			}System.out.println();
		}
	}

}
