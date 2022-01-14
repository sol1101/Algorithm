package SWEA;

import java.util.Scanner;

/* [입력]
가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.

[출력]
출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
*/
public class Q_2072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[10];
		
		for (int i = 0; i<T; i++) {
			int sum = 0;
			for(int j = 0; j<10; j++) {
				arr[j] = sc.nextInt();
				if (arr[j] % 2 ==1) {
					sum += arr[j];
				}
			}System.out.println("#" + (i+1) + " " + sum);
		}
		

	}

}
