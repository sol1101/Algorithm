package BAEKJOON;

import java.util.Scanner;

public class Q_1712 {

	public static void main(String[] args) {
		/* 노트북 가격이 C만원으로 책정되었다고 한다.
		 * 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며,
		 * 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
		 	A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
		 	 최초로 이익이 발생하는 판매량을 출력한다*/

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); //고정비용
		int B = sc.nextInt(); //가변비용
		int C = sc.nextInt(); //가격
		
		if(C-B <= 0) {
			System.out.println(-1);
		}else {
			System.out.println((A/(C-B)+1));
		}
		
		
	}

}
