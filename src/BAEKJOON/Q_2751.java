package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ¼ö Á¤·Ä
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(al);
		
		for(int value : al) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);

	}

}