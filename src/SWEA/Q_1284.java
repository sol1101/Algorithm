package SWEA;

import java.util.Scanner;

public class Q_1284 {

	public static void main(String[] args) {
		// 수도요금경쟁
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int P = sc.nextInt(); int Q = sc.nextInt(); int R = sc.nextInt(); int S = sc.nextInt(); int W = sc.nextInt();
			
			int A = W*P;
			int B;
			
			if(W<=R) B = Q;
			else B = Q + (S*(W-R));
			
			if(A<B) System.out.println("#" + tc + " " + A);
			else if(A>B) System.out.println("#" + tc + " " + B);
			
		}

	}

}
