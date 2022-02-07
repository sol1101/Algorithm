package SWEA;

import java.util.Scanner;

public class Q_2068 {

	public static void main(String[] args) {
		// 최댓수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			int max = 0;
			int arr[] = new int[10];
			
			for(int j = 0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
				if(arr[j] >max) max = arr[j];
			}
			System.out.println("#"+i + " " + max);
		}

	}

}
