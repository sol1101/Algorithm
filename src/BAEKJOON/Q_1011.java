package BAEKJOON;

import java.util.Scanner;

public class Q_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int d = y-x;
			
			int max = (int)Math.sqrt(d);
			
			if(max*max == d) {
				System.out.println(max*2 -1);
			}else if(max*max +max >= d) {
				System.out.println(max*2);
			}else {
				System.out.println(max*2 +1);
			}
		}
		

	}

}
