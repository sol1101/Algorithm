package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2438 {

	public static void main(String[] args) throws IOException {
		//º°Âï±â ¿ÞÂÊ Á¤·Ä
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i<=N; i++) {
			for(int j = 0; j<i; j++) {
				sb.append("*");
			}sb.append("\n");
		}System.out.println(sb);

	}		
}
