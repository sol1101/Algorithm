package BAEKJOON;

import java.util.Scanner;

public class Q_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (H == 0 && M < 45) {
			H = 23;
			M += 60;
			System.out.println(H + " " + (M - 45));
		} else if (H != 0 && M < 45) {
			H -= 1;
			M +=60;
			System.out.println(H + " " + (M-45));
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
