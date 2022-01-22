package BAEKJOON;

import java.util.Scanner;

public class Q_8958 {

	public static void main(String[] args) {
		//OXOOXOOOXOOOO = 1 + 0 + 2 + 0 + 3 + 0 + 4
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			String OX = sc.next();
			
			for(int j = 0; j<OX.length(); j++) {
				if(OX.charAt(j) == 'O') {
					cnt ++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
				
		
		

	}

}
