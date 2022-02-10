package SWEA;

import java.util.Scanner;

public class Q_1989 {

	public static void main(String[] args) {
		// 회문검사
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int check = 0;
			String s = sc.next();
			StringBuffer sb = new StringBuffer(s).reverse();
			
			String sbr = sb.toString();
			
			if(s.equals(sbr)) check = 1;
			
			System.out.println("#" + tc + " " + check );
		}

	}

}
