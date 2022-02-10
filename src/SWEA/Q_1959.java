package SWEA;

import java.util.Scanner;

public class Q_1959 {

	public static void main(String[] args) {
		// ¼ýÀÚ¿­ Ã¼Å©(°ö¼À)
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int Ainum = sc.nextInt();
			int Bjnum = sc.nextInt();
			int Ai[] = new int[Ainum];
			int Bj[] = new int[Bjnum];
			int check = 0;
			int max = 0;
			
			for(int i = 0; i<Ai.length; i++) {
				Ai[i] = sc.nextInt();
			}
			for(int i = 0; i<Bj.length; i++) {
				Bj[i] = sc.nextInt();
			}
			
			if(Ainum>=Bjnum) {
				for(int i = 0; i<Ainum -Bjnum +1; i++) {
					int sum = 0;
					for(int j = 0; j<Bjnum; j++) {
						sum += Bj[j] * Ai[j+i];
						
					}
					if(sum>max) max = sum;
				}
			}
			else{
				for(int i = 0; i<Bjnum - Ainum + 1; i++) {
					int sum = 0;
					for(int j = 0; j<Ainum; j++) {
						sum += Ai[j] * Bj[j+i];
						
					}
					if(sum>max) max = sum;
			}
		}
			System.out.println("#" + tc + " " + max);

	}

}
}
