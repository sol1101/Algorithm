package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q_1546 {

	public static void main(String[] args) throws IOException {
		//점수 중 최댓값을 골라 모든 점수를 점수/최대점수*100으로 고치고 평균 구하기
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double arr[] = new double[N];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		Arrays.sort(arr);
		double max_arr = arr[N-1];
		double avg =0;
		for(int i =0; i<N; i++) {
			avg += ((arr[i]/max_arr)*100);
		}
		System.out.println(avg/N);
		

	}

}
