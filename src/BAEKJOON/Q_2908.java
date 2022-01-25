package BAEKJOON;

import java.util.Scanner;

public class Q_2908 {

	public static void main(String[] args) {
		/*상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
		 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
		  따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
		  두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오. */
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		StringBuffer sbA = new StringBuffer().append(A);
		StringBuffer sbB = new StringBuffer().append(B);
		
		A = Integer.parseInt(sbA.reverse().toString());
		B = Integer.parseInt(sbB.reverse().toString());
		
		System.out.println(A > B ? A : B);
	}

}
