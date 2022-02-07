package BAEKJOON;

import java.util.Scanner;

public class Q_3009 {

	public static void main(String[] args) {
		// 직사각형을 만들기 위한 점 찍기
		
		Scanner sc = new Scanner(System.in);
		
		int x_1 = sc.nextInt(); int y_1 = sc.nextInt();
		
		int x_2 = sc.nextInt(); int y_2 = sc.nextInt();
		
		int x_3 = sc.nextInt(); int y_3 = sc.nextInt();
		
		int x_4 = 0,y_4 = 0;
		
		if(x_1 == x_2) x_4=x_3;
		else if(x_1 == x_3) x_4 = x_2;
		else x_4 = x_1;
		
		if(y_1 == y_2) y_4=y_3;
		else if(y_1 == y_3) y_4 = y_2;
		else y_4 = y_1;
		
		System.out.println(x_4 + " " + y_4);

	}

}
