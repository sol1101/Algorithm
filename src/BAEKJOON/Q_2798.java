package BAEKJOON;

import java.util.Scanner;

public class Q_2798 {

	public static void main(String[] args) {
		// 블랙잭
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int [N];
		int max = 0; // 최댓값
		int sum = 0; // 세 수의 합
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N-2; i++) { // 3개의 카드를 고르니까 처음 카드는 N-2까지 확인
			for(int j = i+1; j<N-1; j++) { // 첫번째 카드 다음부터 N-1까지 확인
				for(int k = j+1; k<N; k++) { // 두번째 카드 다음부터 N까지 확인
					sum = arr[i] + arr[j] + arr[k];
					if(max < sum && sum <= M) max = sum;
				}
			}
		}System.out.println(max);
		

	}

}
