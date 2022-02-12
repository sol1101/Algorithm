package BAEKJOON;

import java.util.Scanner;

public class Q_1002 {

	public static void main(String[] args) {
		// 터렛
		/* 두 원의 중심 사이의 거리를 구한다 (두 점 사이의 거리)
		 * 두 원이 접하면 1 출력
		 * 두 원이 두 점에서 만나면 2출력
		 * 만나지 않으면 0출력
		 * 중심좌표와 반지름이 모두 동일하면 무한대로 만나기때문에 -1 출력*/
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int x1 = sc.nextInt(); int y1 = sc.nextInt(); int r1 = sc.nextInt();
			int x2 = sc.nextInt(); int y2 = sc.nextInt(); int r2 = sc.nextInt();
			
			double d = Math.sqrt((Math.pow((x1-x2), 2)) + Math.pow((y1-y2), 2));
			
			if(x1==x2 && y1==y2 && r1==r2) System.out.println("-1");
			
			else if(d<(r1+r2) && Math.abs(r1-r2)<d) System.out.println("2");
			
			else if(d==(r1+r2) || Math.abs(r1-r2) == d)System.out.println("1");
			
			else if(d>(r1+r2) || Math.abs(r1-r2)>d) System.out.println("0");
		}
		
		

	}

}
