package SWEA;

import java.util.Scanner;

public class Q_1288 {

	public static void main(String[] args) {
		// 불면증 치료법
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 1; i<=T; i++) {
			int N = sc.nextInt();
			int cnt = 1;
			boolean number[] = new boolean [10];
			
			while(true) {
				int check = 0;
				int Ncnt = N*cnt;
				String n = Ncnt+"";
				
				for(int j = 0; j<n.length(); j++) {
					number[Ncnt%10] = true;
					Ncnt /= 10;
				}
				
				for(int k = 0; k<number.length;k++) {
					if(number[k] == true) check ++;
				}
				if(check == 10) break;
				else cnt ++;
				
			}
			
			
			System.out.println("#" + i + " " + N*cnt);
		}
	}

}
