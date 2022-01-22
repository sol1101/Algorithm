package BAEKJOON;

import java.util.Scanner;

public class Q_1065 {

	public static void main(String[] args) {
		//ÇÑ¼ö
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Han(num));
	}
	static int Han(int num) {
		int cnt = 0;
		for(int i = 1; i<=num; i++) {
			if(i<=99) {
				cnt ++;
			}else if(i<=999) {
				int num1 = i/100;
				int num2 = (i % 100)/10;
				int num3 = i%10;
				if( num1-num2 == num2-num3) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
}
