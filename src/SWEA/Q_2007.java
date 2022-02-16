package SWEA;

import java.util.Scanner;

public class Q_2007 {

	public static void main(String[] args) {
		// 패턴 마디의 길이
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			String s = sc.next();
			
			for(int i = 1; i<=s.length()/2; i++) {
				if(s.substring(0,i).equals(s.substring(i,i*2))) {
					
					System.out.println("#" + tc + " " + i );
					break;
				}
			}
			
		}

	}

}
