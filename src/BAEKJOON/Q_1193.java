package BAEKJOON;

import java.util.Scanner;

public class Q_1193 {

	public static void main(String[] args) {
		// 분수구하기

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int line = 1;
		int cnt = 0;
		
		// X가 몇번째 라인에 있는지
		while(true) {
			if(cnt+line>=X) {
				break;
			}
			cnt += line;
			line ++;
		}
		int result = X -cnt;
		
		if(line %2 == 1) {
			System.out.println((line - result +1) + "/" + result);
		}else {
			System.out.println((result + "/" + (line-result+1)));
		}
	}

}
