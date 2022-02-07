package BAEKJOON;

import java.util.Scanner;

public class Q_1085 {

	public static void main(String[] args) {
		/* 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고,
		 * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
		 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오. */

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
	
		int short_x = Math.min((w-x), x);
		int short_y = Math.min((h-y), y);
		
		System.out.println(Math.min(short_x, short_y));
			
		
	}

}
