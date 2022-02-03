package BAEKJOON;

import java.math.BigInteger;
import java.util.Scanner;

public class Q_10757 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));

	}

}
