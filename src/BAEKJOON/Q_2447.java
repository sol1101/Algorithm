package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q_2447 {
	
	static char[][] arr;
	public static void main(String[] args) {
		// 별찍기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new char[n][n];
		// 배열 공백처리
		for(int i = 0; i<n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		// 메소드 실행
		check(0,0,n);
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}

	
	}
	
	static void check(int x, int y, int num) { // 별찍기 메소드
		//나눠지지 않을때 * 삽입
		if(num == 1) {
			arr[x][y] = '*';
			return;
		}
		int s = num/3;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==1 && j==1) {
					continue;
				}
				check(x+s*i, y+s*j, s);
			}
		}
	}
}
