package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// �� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int arr[] = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = (Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i<N; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);

	}

}