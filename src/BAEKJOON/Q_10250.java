package BAEKJOON;

import java.util.Scanner;

public class Q_10250 {

	public static void main(String[] args) {
		/*  102 호 방보다는 301 호 방을 더 선호하는데,
		 * 102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다.
		 * 같은 이유로 102 호보다 2101 호를 더 선호한다.
		 * 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
		 * 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며
		 * 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다 */

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트케이스

		for(int i = 0; i<T; i++) {
			int H = sc.nextInt(); // 호텔의 층 수
			int W = sc.nextInt(); // 각 층의 방 수
			int N = sc.nextInt(); // 몇 번째 손님인지
			
			if(N%H == 0) {
				System.out.println((H*100) + (N/H));
			}else {
				System.out.println(((N%H)*100) + ((N/H) + 1));
				
			}
			
			
			
			
		}
		
	}

}
