package SWEA;

import java.util.Scanner;

public class Q_1986 {

	public static void main(String[] args) {
		// È¦¼ö´Â ´õÇÏ°í Â¦¼ö »©±â
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i = 1; i<=T; i++) {
			int result = 0;
			int N = sc.nextInt();
			
			for(int j = 1; j<=N; j++) {
				if(j%2 ==0) result-=j;
				else result += j;
			}
			System.out.println("#"+i +" "+ result);
		}

	}

}
