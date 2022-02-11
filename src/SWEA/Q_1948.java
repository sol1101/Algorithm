package SWEA;

import java.util.Scanner;

public class Q_1948 {

	public static void main(String[] args) {
		// 날짜계산기
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); 
		int []md = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int tc = 1; tc<=T; tc++) {
			int fm = sc.nextInt(); int fd = sc.nextInt(); int lm = sc.nextInt(); int ld = sc.nextInt();
			int sum = 0;
			
			sum += ld - fd + 1;
			
			for(int i = fm; i<lm; i++) {
				sum += md[i - 1];
			}
			
			System.out.println("#" + tc + " " + sum);

		}
	}

}
