package BAEKJOON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q_15552 {

	public static void main(String[] args) throws IOException  { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," "); //문자열 분리
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
		bw.flush(); // 남아있는 데이터 모두 출력
		bw.close(); //스트림 닫음
	}
}
