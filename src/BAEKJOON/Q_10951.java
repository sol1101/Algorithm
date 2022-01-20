package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10951 {

	public static void main(String[] args) throws IOException {
		// A + B ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str;
		while( (str = br.readLine()) != null ){
		    
			StringTokenizer st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		
		}
		System.out.print(sb);
	}
}
