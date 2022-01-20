package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Q_10818 {

	public static void main(String[] args) {
		// N크기의 배열을 생성하고 최댓값 최솟값 구하기
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int Arr[] = new int[N];
		
		for(int i = 0; i<Arr.length;i++) {
			Arr[i] = sc.nextInt();
		}
		Arrays.sort(Arr);
		System.out.println(Arr[0] + " " + Arr[N-1]);
		

	}

}
